package Jun2018;

public class PCFactory implements ComputerAbstractFactory {
  private String hdd;
  private String ram;

  public PCFactory(String hdd, String ram) {
    this.hdd = hdd;
    this.ram = ram;
  }

  @Override
  public Computer2 createComputer() {
    return new PC2(hdd, ram);
  }
}
