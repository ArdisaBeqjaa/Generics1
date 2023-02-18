package Solved_ex;

public class GenericSorrt {
//    sort ints,doubles,char,strigns
//    duke qe se jan klasa te ndryhsme ne i bje t krjojm 4 funsione
//    qe do ken te njejtat veprime por parametra te !=
    public static void main(String[] args){
     Integer[]  arr= new Integer[]{2, 3, 4};
     Double[] arr2=new Double[]{2.1,3.4};
     String[] arr3={"Tom","Susan","Kim"};

     sort(arr3);
//     sort(arr2);

     print(arr3);
//     print(arr2);

    }
    public static<T extends Comparable<T>> void sort(T[] t){
       T min;
       int index;
       for(int i=0;i<t.length-1;i++){
           min=t[i];
           index=i;
           for(int j=1+i;j<t.length;j++){
               if(min.compareTo(t[j])>0){
                   min=t[j];
                   index=j;
               }

           }
           if(index!=i){
               t[index]=t[i];
               t[i]=min;

           }

       }
    }
//pse e bjem object edhe jo T
   public static void print( Object[] list){
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
   }
}
