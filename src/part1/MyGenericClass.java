package part1;

public class MyGenericClass<T> {
    T x;
    MyGenericClass(T x){this.x=x;}
    public T getvalue(){
        return x;
    }
}
