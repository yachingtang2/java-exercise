package Jun2018;

public class MyComputer {
  private String ram;
  private boolean blueToothEnabled;

  public String getRAM() {
    return ram;
  }

  public boolean isBlueToothEnabled() {
    return blueToothEnabled;
  }

  private MyComputer(Builder builder) {
    this.ram = builder.ram;
    this.blueToothEnabled = builder.blueToothEnabled;
  }

  public static class Builder {
    private String ram;
    private boolean blueToothEnabled;

    public Builder(String ram) {
      this.ram = ram;
    }

    public Builder withBlueToothEnabled(boolean blueToothEnabled) {
      this.blueToothEnabled = blueToothEnabled;
      return this;
    }

    public MyComputer build() {
      return new MyComputer(this);
    }
  }
}
