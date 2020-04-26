package Nov2019;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.observers.DisposableObserver;

import javax.security.auth.Subject;
import java.util.concurrent.TimeUnit;

public class ReactiveJavaExercise {

  public static void main(String... args) {
    Observable.timer(20,TimeUnit.MILLISECONDS)
        .subscribe(time -> System.out.println("time = " + time))
        .dispose();

    Observable<Integer> integers = Observable.range(1,5);

    integers.subscribe(number -> System.out.println(5 / number),
        error -> System.out.println("Error occurs - " + error),
        () -> System.out.println("Completed"))
      .dispose();

//    ObservableOnSubscribe<String> observableOnSubscribe = new Observable.
    Observable.create(new ObservableOnSubscribe<Subject>() {
      @Override
      public void subscribe(@NonNull ObservableEmitter<Subject> emitter) throws Throwable {

      }
    });

    Person person = new Person();
    Observable<String> nameObservable = Observable.defer(() -> Observable.just(person.getName()));
    Observable<Integer> ageObservable = Observable.defer(() -> Observable.just(person.getAge()));

    person.setName("Mary");
    person.setAge(25);
    nameObservable.subscribe(name -> System.out.println("--- name is: " + name),
        System.out::println,
        () -> System.out.println("name completed"))
        .dispose();
    ageObservable.subscribe(age -> System.out.println("--- age is: " + age),
        System.out::println,
        () -> System.out.println("age completed"))
        .dispose();

    Observable<Integer> emptyIntegerObservable = Observable.empty();

    Observable.just("1", "2", "a", "4", "5")
      .map(Integer::parseInt)
//      .onErrorResumeNext(e -> Observable.error(new UnsupportedOperationException(e)))
//      .onErrorResumeNext(e -> Observable.empty())
//        .onErrorReturn(e -> 100)
//        .retry(2)
        .retryWhen(errors -> {
          return errors.zipWith(Observable.range(1,3), (n,i) -> i)
                    .flatMap(retryCount -> Observable.timer((long)Math.pow(5,retryCount), TimeUnit.SECONDS));
        })
      .subscribe(System.out::println,
          System.out::println,
          () -> System.out.println("Completed"))
      .dispose();

    Observable.just(1,2,3,4,5)
        .subscribe(new DisposableObserver<Integer>() {
          @Override
          protected void onStart() {
            System.out.println("Start!");
          }

          @Override
          public void onNext(@NonNull Integer integer) {
            System.out.println("Integer = " + integer);
          }

          @Override
          public void onError(@NonNull Throwable e) {
            System.out.println("Error occurs!");
          }

          @Override
          public void onComplete() {
            System.out.println("Done!");
          }
        });

  }
}
