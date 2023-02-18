package part1;
//to make a class generic we add<T>
public class generic_classes {

  Integer x;
  generic_classes(Integer x){
       this.x=x;
  }
  public Integer getValue(){
      return x;
  }
}
