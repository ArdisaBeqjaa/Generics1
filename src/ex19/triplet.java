package ex19;

public class triplet<T> {
    private T a;
    private T b;
    private T c;

    public T getA() {
        return a;
    }
     triplet(T a,T b,T c){
        this.a=a;
        this.b=b;
        this.c=c;
     }
    public T getB() {
        return b;
    }

    public T getC() {
        return c;
    }

    public static <T extends Comparable<? super T>> T max (triplet<T> t){
        T max;
        if(t.getA().compareTo(t.b)>0&&t.getA().compareTo(t.c)>0)return t.getA();
        else return t.getB();
    }
}
