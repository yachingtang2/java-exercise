package Nov2019;

import io.reactivex.rxjava3.core.Observable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

class X {
  public int x = 1;

  public String toString() { return "(" + x + ")"; }
}

class Y extends X {

  public Y() {
    x = 2;
  }
}

public class ObservableExercise {

  public static void main(String... args) throws InterruptedException {
    List<String> strings = List.of("How", "are", "you?");
    Observable.fromIterable(strings)
        .map(string -> string.concat(", "))
        .subscribe(System.out::println, System.err::println)
        .dispose();

    System.out.println(".....Flat Map......");
    List<String> sentences = List.of("hey you!", "no Problem%?");
    Observable.fromIterable(sentences)
        .flatMap(sentence -> Observable.fromArray(sentence.split("\\W+")))
        .subscribe(System.out::println)
        .dispose();

    System.out.println(".....Using boolean......");
    Observable<Integer> numbers = Observable.just(1, 13, 32, 45, 21, 8, 98, 103, 55);
    numbers.any(number -> number % 11 == 0)
        .subscribe(System.out::println)
        .dispose();
    numbers.all(number -> number > 0)
        .subscribe(System.out::println)
        .dispose();
    numbers.contains(56)
        .subscribe(System.out::println)
        .dispose();
    numbers.isEmpty()
        .subscribe(System.out::println)
        .dispose();

    System.out.println(".....Using GroupBy......");
    List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9);
    Observable.fromIterable(integers).groupBy(number -> number % 3)
        .flatMapSingle(Observable::toList)
        .subscribe(values -> System.out.println("values = " + values))
        .dispose();

    System.out.println(".....Using Cast......");
    Observable.just(new X(), new Y(), new X(), new Y())
        .cast(X.class)
        .subscribe(System.out::println)
        .dispose();

    System.out.println(".....Using Filter......");
    Observable<Integer> numbersForFilter = Observable.just(5,10,15,20,25,30,35,40,45,50);
    numbersForFilter.filter(number -> number %2 == 0)
        .subscribe(System.out::println)
        .dispose();
    numbersForFilter.take(4)
        .subscribe(System.out::println)
        .dispose();
    numbersForFilter.takeLast(4)
        .subscribe(System.out::println)
        .dispose();
    numbersForFilter.skip(3)
        .subscribe(System.out::println)
        .dispose();

    System.out.println(".....Using TimeInterval and TimeStamp......");
    Observable.interval(1000L, TimeUnit.MILLISECONDS)
        .timeInterval()
        .subscribe(System.out::println);

    Thread.sleep(3000);

    Observable.just("Hello, World!", "Goodbye, World!")
        .timestamp()
        .subscribe(next -> {
              System.out.println("next = " + next);
              System.out.println("value: " + next.value());
            },
            System.out::println,
            () -> System.out.println("completed"))
        .dispose();

    Thread.sleep(5000);
    System.out.println("END");

    System.out.println(".....Using Scan......");
    Observable.just("you", "are", "great")
        .scan(0, (length, next) -> length + next.length())
        .subscribe(len -> System.out.println("Incremental length: " + len))
        .dispose();
    Observable.just(1,2,3,4,5)
        .scan(100, Integer::sum)
        .subscribe(sum -> System.out.println("Incremental sum: " + sum))
        .dispose();

    System.out.println(".....Using Zip......");
    Observable<Integer> numbers1 = Observable.just(1,2,3);
    Observable<Integer> numbers2 = Observable.just(4,5,6);
    Observable.zip(numbers1, numbers2, Integer::sum)
        .subscribe(System.out::println)
        .dispose();

    Observable<String> strings1 = Observable.just("1","2","3");
    Observable<String> strings2 = Observable.just("4","5","6");
    Observable.zip(strings1, strings2, (string1, string2) -> string1 + string2)
        .subscribe(System.out::println)
        .dispose();
    Observable.zip(strings1, strings2,
        (string1, string2) -> string1 + " + " + string2 + " = " + (Integer.parseInt(string1) + Integer.parseInt(string2)))
        .subscribe(System.out::println)
        .dispose();

    System.out.println("Testing = " + 2 + 5);
    System.out.println("Testing = " + (2 + 5));

    System.out.println(".....Using Concat......");
    Observable<String> flowers1 = Observable.just("Rose");
    Observable<String> flowers2 = Observable.just("Tiger Lily");
    Observable<String> flowers3 = Observable.just("Iris");
    Observable.concat(flowers1, flowers2, flowers3)
        .sorted()
        .subscribe(System.out::println)
        .dispose();

    System.out.println(".....Re-actively Filter and Tranform Data......");
    Observable.just("11/11/13", "1/3/15", "4/18/20")
        .map(date -> {
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");
          return LocalDate.parse(date, formatter);
        })
        .filter(localDate -> localDate.getYear() > 2013)
        .subscribe(localDate -> System.out.println("ISO-8601: " + localDate),
            System.out::println)
        .dispose();
  }
}
