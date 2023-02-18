package ex19;

public class pair<T> {
    private T obj1;
    private T obj2;

    pair(T obj1, T obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public T getObj2() {
        return obj2;
    }

    //  krahason kto ,1,3,4
//    public static <T extends Comparable<T>> T minm(pair<T> t) {
//        if(t.getObj1().compareTo(t.obj2)<0)
//            return  t.obj1;
//        return t.obj2;
//
//    }
//    me wild cards
    public static <T extends Comparable<? super T>>T small(pair<T> t){
        if(t.getObj1().compareTo(t.getObj2())<0)
            return  t.obj1;
        return t.obj2;
    }

}
