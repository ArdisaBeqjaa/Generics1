package Solved_ex;

public class Solved_book_ex {
    public static void main(String[] args){
//        printo elementet e nje array me hapsire
        Integer[] array={1,2,3,4,5};

        String[]  array2={"ad","da","dfa"};
//        printmethod(array2);
        Solved_book_ex.<Integer>printmethod(array);
    }
    public static<T> void printmethod(T[] t){
        for(int i=0;i<t.length;i++){
            System.out.println(i+" ");
        }
    }
}
