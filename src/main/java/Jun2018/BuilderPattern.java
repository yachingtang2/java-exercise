package Jun2018;

public class BuilderPattern {
  public static void main(String[] args) {
    Laptop laptop = new Laptop.Builder("16GB", "256GB")
        .withGraphicCardEnabled(true)
        .withBluetoothEnabled(true)
        .build();

    System.out.println(laptop.getHDD() + ", " + laptop.getRAM() + ", " + laptop.isGraphicCardEnabled() + ", " + laptop.isBluetoothEnabled());

  }
}
