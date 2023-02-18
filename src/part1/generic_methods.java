package part1;

public class generic_methods {
    public static  void main(String args[]){
        Integer[] intarray={1,2,3,4};
        Double[] doublearray={2.2,3.1,2.4};

        dispayArray(intarray);
        dispayArray(doublearray);
        System.out.println(getFirst(intarray));
    }
//    direkt pas fjales static vendos <T>
//    pa return
    public static <T>void dispayArray(T[] array){
        for(T t:array){
            System.out.println(t+" ");
        }
        System.out.println();
    }
    public static <T> T getFirst(T[] array){
      return array[0];
    }

}
