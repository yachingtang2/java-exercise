package Jun2018;

public class Fibonacci {
  public int compute(int number) {
    int fibonacci = 0;

    if(number == 0 || number == 1) {
      fibonacci += 1;
    } else {
      fibonacci = compute(number - 1) + compute(number - 2);
    }

    return fibonacci;
  }

  // 1,1,2,3,5,8,13
  // number = 1, f = 0 + 1 = 1,
  // number = 2, f = 1 + 1 = 2
  // number = 3, f = 2 + 1 = 3
  // number = 4, f = 3 + 2 = 5,
  // 1+2=3
  // 2+3=5
  // 3+5=8
}
