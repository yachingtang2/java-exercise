package Nov2019;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

class FunctionExampleTest {
  private Function<String, String> capitalize =
      string -> string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
  private Function<String, String> concatenateSymbol = string -> string + "?";
  private Function<Integer, Integer> add = value -> value + 5;
  private Function<Integer, Integer> multiply = value -> value * 2;

  @Test
  void apply() {
    System.out.println(capitalize.apply("yct"));
    System.out.println(capitalize.apply("Han-HAN"));
    System.out.println(capitalize.andThen(concatenateSymbol).apply("hOW ARE YOU"));
    System.out.println(capitalize.compose(concatenateSymbol).apply("HEY stranger"));
  }

  @Test
  void andThen() {
    System.out.println("andThen - " + add.andThen(multiply).apply(3));
  }

  @Test
  void compose() {
    System.out.println("compose - " + add.compose(multiply).apply(3));
  }
}
