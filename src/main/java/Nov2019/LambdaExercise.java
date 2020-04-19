package Nov2019;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

interface Apex { default String hello() { return "Apex"; } }
interface Foo extends Apex { default String hello() { return "Foo"; } }
//interface Bar extends Foo { default String hello() { return "Bar"; } }
interface Bar extends Apex { default String hello() { return "Bar"; } }

interface Intf {
  default String hello(int l) { return "Intf"; }
}

class Impl implements Intf {
  String hello(long l) { return "Foo"; }
}

public class LambdaExercise implements Bar, Foo {

  private AtomicInteger count = new AtomicInteger(1);
  private Runnable r1 = () -> System.out.println(this);
  private Runnable r2 = () -> System.out.println(toString());

  private IntUnaryOperator factorial;

  public LambdaExercise() {
    factorial = number -> number == 1 ? 1 : factorial.applyAsInt(number - 1);
  }

  private static Integer apply(Integer newNumber) {
    return newNumber;
  }

  public void localVariable() {
    final int number = 1;

    IntUnaryOperator runnable = value -> {
//      int number = 3;
      return value + number;
    };
  }

  public String toString() {
    return "Hello World!!!" + count.incrementAndGet();
  }

  public static void main(String... args) throws Exception {
//    new LambdaExercise().r1.run();
//    new LambdaExercise().r2.run();

    IntUnaryOperator intUnaryOperator = number -> {
      int value = 1;
      return number + value;
    };

    Callable<Runnable> callable = () -> () -> System.out.println("ABC");
    callable.call().run();
    Callable<Consumer<Integer>> consumerCallable = () -> value -> {};
    consumerCallable.call().accept(3);
    Callable<Supplier<String>> supplierCallable = () -> () -> "abc";
    supplierCallable.call().get();

    Callable<Integer> integerCallable = () -> 123;
    integerCallable.call();

    Object o = (Supplier<Integer>) () -> 38;

    IntStream.iterate(1, i -> i * 2)
        .limit(10)
        .forEachOrdered(System.out::println);

    Stream.of(1, 2, 3, 4, 5)
        .map(number -> number + 1)
        .max(Comparator.comparing(Integer::valueOf))
        .ifPresent(System.out::println);

    IntStream.rangeClosed(11,15)
        .map(number -> number + 1)
        .max()
        .ifPresent(System.out::println);

    IntStream.rangeClosed(5, 9)
        .sum();

    int totalSum = Stream.of(5,10,15)
        .mapToInt(Integer::valueOf)
        .sum();
    System.out.println("totalSum = " + totalSum);

    int sum = IntStream.rangeClosed(1, 5)
        .reduce(0, Integer::sum);
    System.out.println("sum = " + sum);

    int factorial = IntStream.rangeClosed(1, 5)
        .reduce(1, (number1, number2) -> number1 * number2);
    System.out.println("Factorial = " + factorial);

    List<Integer> integers = Arrays.asList(10, 5, 20, 15, 0);
    integers.stream()
        .forEachOrdered(System.out::println);
    integers.stream()
        .forEach(System.out::println);

    System.out.println("YCT ---");
    List<Integer> numbers =
        Stream.of(8, 3, 5, 6, 7, 4)
        .filter(number -> number % 2 == 0)
        .sorted()
        .distinct()
        .map(number -> number + 1)
        .unordered()
        .peek(System.out::println)
        .collect(toList());


    String joined = List.of("a", "b", "c")
        .parallelStream()
        .unordered()
        .map(String::toUpperCase)
        .collect(Collectors.joining());
    System.out.println("\njoined = " + joined);

    System.out.println(new LambdaExercise().hello());

    System.out.println("Hello from " + new Impl().hello(3));

  }

  public String hello() {
    return Bar.super.hello();
  }

}
