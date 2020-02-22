package Nov2019;

import static java.util.Arrays.stream;

public class CountNines {
  public int count(int[] sequence) {

    return stream(sequence)
        .filter(value -> String.valueOf(value).contains("9"))
        .map(this::countNines)
        .sum();
  }

  private int countNines(int number) {
    int divider = number;
    int remainder;
    int nines = 0;

    while(divider > 0) {
      remainder = divider % 10;
      divider = divider / 10;

      if(remainder == 9) {
        nines++;
      }
    }
//    System.out.println("YCT - " + number + ", " + nines);
    return nines;
  }
}
