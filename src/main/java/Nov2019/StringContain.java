package Nov2019;

import static java.util.Arrays.stream;

public class StringContain {
  public String[] contains(String[] array1, String[] array2) {

    return stream(array2)
//            .peek(System.out::println)
            .filter(string -> stream(array1).anyMatch(string::contains))
            .distinct()
            .sorted()
            .toArray(String[]::new);
  }
}
