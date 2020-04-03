package Nov2019;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;
import static java.util.Comparator.comparing;

public class CountNines {
  public int count(int[] sequence) {

    Comparator<String> test = comparing(String::length);
    System.out.println("1 - YCT = " + test.compare("a", "de"));
    System.out.println("2 - YCT = " + test.compare("ab", "de"));
    System.out.println("3 - YCT = " + test.compare("abc", "de"));

    List<Integer> integers = Arrays.asList(10, 5, 20, 1);
    integers.stream()
        .sorted(comparing(Integer::intValue))
        .forEach(System.out::println);

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
