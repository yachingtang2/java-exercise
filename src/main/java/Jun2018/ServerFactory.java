package Jun2018;

public class ServerFactory implements ComputerAbstractFactory {
  private String hdd;
  private String ram;

  public ServerFactory(String hdd, String ram) {
    this.hdd = hdd;
    this.ram = ram;
  }

  @Override
  public Computer2 createComputer() {
    return new Server2(hdd, ram);
  }
}