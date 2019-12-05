package Jun2018;

public class NumberReverse {

  public int reverse(int number) {
    int remainder;
    int reversedNumber = 0;
    int undivided = number;

    while(undivided >= 1) {
      remainder = undivided % 10; // 1
      undivided = undivided / 10; // 0

      reversedNumber = reversedNumber * 10 + remainder; //1
    }

    return reversedNumber;
  }
}