package ex19;

public class Test_pari {

    public  static void main(String args[]){
        pair<Integer>nr1=new pair<>(1,3);
        pair<Double>nr2=new pair<>(2.3,2.1);

//        System.out.println(pair.minm(nr1));
//        System.out.println(pair.minm(nr2));
        System.out.println(pair.small(nr1));
        System.out.println(pair.small(nr2));

        triplet<Integer>test1=new triplet<>(1,2,1);
        System.out.println(test1.max(test1));
    }




}
