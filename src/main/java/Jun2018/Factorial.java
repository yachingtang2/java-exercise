package Jun2018;

public class Factorial {

  public int compute(int number) {
    if (number == 1) {
      return 1;
    } else if (number > 1) {
      System.out.println("number = " + number);
      return number * compute(number - 1);
    } else {
      return 0;
    }

    // 3 * compute(2);
    // 2 * compute(1);
    // 1 * compute(0);
    // 0 * compute(-1);
  }
}
