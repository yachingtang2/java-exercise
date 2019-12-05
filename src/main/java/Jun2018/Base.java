package Jun2018;

public class Base {

  public void foo(String s) {
    System.out.println("String");
  }

  public void foo(StringBuffer sb){
    System.out.println("StringBuffer");
  }

//  public static void main(String[] args) {
//    new Jun2018.Base().foo(null);
//  }

  public String toString(){
    System.out.println("Test toString called");
    return "";
  }

  public static void main(String args[]){
    Base base = new Base();
    System.out.println(base.toString());
  }

}