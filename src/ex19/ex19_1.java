package ex19;

import java.util.Arrays;

public class ex19_1<T> {
//    shtojm element ne nje array
//    gerneric klass qe do zmadhoj nje array

    private int size;
    private static final int capacity = 100;
    private T[] elements = (T[]) new Object[capacity];

    ex19_1() {

    }

    public void push(T o) {
        elements[size++] = o;
        if (size == capacity) {
            T[] temp = (T[]) new Object[size * 3];
            System.arraycopy(elements,0,temp,0,elements.length);
        }
    }
    public String toString(){
        return Arrays.toString(elements);
    }
}
