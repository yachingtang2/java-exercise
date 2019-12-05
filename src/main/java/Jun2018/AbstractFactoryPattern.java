package Jun2018;

public class AbstractFactoryPattern {
  public static void main(String[] args) {
    testAbstractFactory();
  }

  private static void testAbstractFactory() {
    Computer2 pc = ComputerFactory2.getComputer(new PCFactory("16GB", "256GB"));
    Computer2 server = ComputerFactory2.getComputer(new ServerFactory("64GB", "1TB"));

    System.out.println("pc = " + pc);
    System.out.println("server = " + server);
  }
}
