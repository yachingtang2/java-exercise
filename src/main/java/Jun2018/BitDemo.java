package Jun2018;

import java.math.BigInteger;

class BitDemo {
  public static void main(String[] args) {
    int bitmask = 0x000F;
    int val = 0x2222;
    // prints "2"

    System.out.println("bitmask = " + hexToBin("000F"));
    System.out.println("    val = " + hexToBin("2224"));
    System.out.println(val & bitmask);
  }

  public static String hexToBin(String s) {
    return new BigInteger(s, 16).toString(2);
  }
}