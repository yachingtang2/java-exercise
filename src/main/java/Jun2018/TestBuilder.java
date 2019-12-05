package Jun2018;

public class TestBuilder {
  public static void main(String[] args) {
//    Jun2018.MyComputer myComputer = new Jun2018.MyComputer.ComputerBuilder("16GB", "500GB").withHasBlueTooth(true).build();
//
//    System.out.println("Jun2018.MyComputer = " + myComputer);

    MyComputer myComputer = new MyComputer.Builder("8GB").withBlueToothEnabled(true).build();

    System.out.println("My Jun2018.Computer = " + myComputer);
  }
}
