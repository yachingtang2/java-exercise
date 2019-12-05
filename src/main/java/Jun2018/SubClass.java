package Jun2018;

public class SubClass extends SuperClass {
  public String myTest() {
    return "456";
  }

  public static void main(String[] args) {
    SubClass subClass = new SubClass();
    System.out.println(subClass.test());
    System.out.println(subClass.myTest());
  }
}
