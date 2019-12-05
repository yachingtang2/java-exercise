package Jun2018;

public class ComputerFactory2 {
  public static Computer2 getComputer(ComputerAbstractFactory computerAbstractFactory) {
    return computerAbstractFactory.createComputer();
  }
}
