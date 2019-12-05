package Jun2018;

public abstract class Computer2 {
  public abstract String getHDD();
  public abstract String getRAM();

  public String toString() {
    return this.getHDD() + ", " + this.getRAM();
  }
}
