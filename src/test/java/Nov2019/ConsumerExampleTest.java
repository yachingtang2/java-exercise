package Nov2019;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerExampleTest {
  private Consumer<Integer> printIntegerValue = System.out::println;
  private Consumer<Integer> printIntegerValueSameLine = value -> System.out.print(value + ", ");
  private Consumer<Integer> multipleBy2 = value -> System.out.println("YCT - " + value * 2 + ", ");

  @Test
  void printAccept() {
    printIntegerValue.accept(5);
  }

  @Test
  void printAcceptSingleLine() {
    List<Integer> numbers = Arrays.asList(10, 20, 30);
    for(Integer number : numbers) {
      printIntegerValueSameLine.accept(number);
    }
  }

  @Test
  void printAcceptAndThen() {
    Consumer<String> consumer1 = string -> System.out.println(string + " you");
    Consumer<String> consumer2 = string -> System.out.println(string + " world");

    consumer1.andThen(consumer2).accept("Hello");
  }

  @Test
  void printAcceptAndThenMultipleNumber() {
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    for (Integer number: numbers) {
      multipleBy2.andThen(printIntegerValue).accept(number);
    }
  }
}
