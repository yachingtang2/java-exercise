package Jun2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UseStream {
  public List<String> getStrings() {
    return strings;
  }

  public void setStrings(List<String> strings) {
    this.strings = strings;
  }

  private List<String> strings = new ArrayList<>();


  public static void main(String[] args) {
    UseStream useStream = new UseStream();

    useStream.setStrings(Arrays.asList("abc", "xyz"));

    useStream.getStrings()
        .stream()
        .map(string -> (string + "!"))
        .forEach(string -> System.out.println(string));

    int[] intArray = {1,2,3,4,5};

    Stream<int[]> intStreamArray = Stream.of(intArray);

    IntStream intStream = intStreamArray.flatMapToInt(Arrays::stream);

    intStream.forEach(System.out::println);
  }
}
