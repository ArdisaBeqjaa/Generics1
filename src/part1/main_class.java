package part1;

public class main_class {
    public static  void main (String[]args){
        MyIntegerClass myint=new MyIntegerClass(1);
        MyStringClass myString=new MyStringClass("hi");
//        System.out.println(myint.getX());
//        System.out.println(myString.getX());
//        generic_classes<Integer> myint2=new generic_classes<>(12);
//        System.out.println(myint2.getvalue());
       MyGenericClass<Integer> myint2=new MyGenericClass<>(10);
        System.out.println(myint2.getvalue());
        System.out.println();
    }
}
