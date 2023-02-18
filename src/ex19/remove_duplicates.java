package ex19;

import java.util.ArrayList;

public class remove_duplicates {
    public static void main(String args[]) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(1);


        System.out.println(array);
        System.out.println(removeduplicates(array));

    }

    public static <E extends Comparable<E>>ArrayList<E> removeduplicates(ArrayList<E> array) {

        ArrayList<E> arr2=new ArrayList<>();

        for(E e:array){
            if(!arr2.contains(e)){
                arr2.add(e);
            }
        }

      return  arr2;

    }
}