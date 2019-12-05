package Jun2018;

public class Laptop {
  private String hdd;
  private String ram;
  private boolean isGraphicCardEnabled;
  private boolean isBluetoothEnabled;

  public String getHDD() {
    return this.hdd;
  }

  public String getRAM() {
    return this.ram;
  }

  public boolean isGraphicCardEnabled() {
    return this.isGraphicCardEnabled;
  }

  public boolean isBluetoothEnabled() {
    return this.isBluetoothEnabled;
  }

  private Laptop(Builder builder) {
    this.hdd = builder.hdd;
    this.ram = builder.ram;
    this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
    this.isBluetoothEnabled = builder.isBluetoothEnabled;
  }

  public static class Builder {
    private String ram;
    private String hdd;
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public Builder(String ram, String hdd) {
      this.ram = ram;
      this.hdd = hdd;
    }

    public Builder withGraphicCardEnabled(boolean isGraphicCardEnabled) {
      this.isGraphicCardEnabled = isGraphicCardEnabled;
      return this;
    }

    public Builder withBluetoothEnabled(boolean isBluetoothEnabled) {
      this.isBluetoothEnabled = isBluetoothEnabled;
      return this;
    }

    public Laptop build() {
      return new Laptop(this);
    }
  }
//  private String ram;
//  private String hdd;
//
//  private boolean isGraphicCardEnabled;
//  private boolean isBluetoothEnabled;
//
//  public String getRAM() {
//    return this.ram;
//  }
//
//  public String getHDD() {
//    return this.hdd;
//  }
//
//  public boolean isGraphicCardEnabled() {
//    return this.isGraphicCardEnabled;
//  }
//
//  public boolean isBluetoothEnabled() {
//    return this.isBluetoothEnabled;
//  }
//
//  private Jun2018.Laptop(Builder builder) {
//    this.ram = builder.ram;
//    this.hdd = builder.hdd;
//    this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
//    this.isBluetoothEnabled = builder.isBluetoothEnabled;
//  }
//
//  public static class Builder {
//    private String ram;
//    private String hdd;
//
//    private boolean isGraphicCardEnabled;
//    private boolean isBluetoothEnabled;
//
//    public Builder(String ram, String hdd) {
//      this.ram = ram;
//      this.hdd = hdd;
//    }
//
//    public Builder withGraphicCardEnabled(boolean isGraphicCardEnabled) {
//      this.isGraphicCardEnabled = isGraphicCardEnabled;
//      return this;
//    }
//
//    public Builder withBluetoothEnabled(boolean isBluetoothEnabled) {
//      this.isBluetoothEnabled = isBluetoothEnabled;
//      return this;
//    }
//
//    public Jun2018.Laptop build() {
//      return new Jun2018.Laptop(this);
//    }
//  }
}
