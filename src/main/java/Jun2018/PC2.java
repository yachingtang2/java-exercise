package Jun2018;

public class PC2 extends Computer2 {
  private String hdd;
  private String ram;

  public PC2(String hdd, String ram) {
    this.hdd = hdd;
    this.ram = ram;
  }

  @Override
  public String getHDD() {
    return this.hdd;
  }

  @Override
  public String getRAM() {
    return this.ram;
  }
}
