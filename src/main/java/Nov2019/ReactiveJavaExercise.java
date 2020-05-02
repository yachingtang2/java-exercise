package Nov2019;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.subjects.AsyncSubject;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

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

    System.out.println("--- PublishSubject");
    PublishSubject<Integer> publishSubject = PublishSubject.create();
    publishSubject.subscribe(
        integer -> System.out.println("first: next item is " + integer),
        integer -> System.out.println("first: error - " + integer),
        () -> System.out.println("first: sequence completed")
    );
    publishSubject.onNext(1);
    publishSubject.onNext(2);
    publishSubject.subscribe(
        integer -> System.out.println("second: next item is " + integer),
        integer -> System.out.println("second: error - " + integer),
        () -> System.out.println("second: sequence completed")
    );
    publishSubject.onNext(3);
    publishSubject.onNext(4);
    publishSubject.onNext(5);
    publishSubject.onComplete();

    System.out.println("--- BehaviorSubject");
    BehaviorSubject<Integer> behaviorSubject = BehaviorSubject.create();
    behaviorSubject.subscribe(
        integer -> System.out.println("first: next item is " + integer),
        integer -> System.out.println("first: error - " + integer),
        () -> System.out.println("first: sequence completed")
    );
    behaviorSubject.onNext(1);
    behaviorSubject.onNext(2);
    behaviorSubject.subscribe(
        integer -> System.out.println("second: next item is " + integer),
        integer -> System.out.println("second: error - " + integer),
        () -> System.out.println("second: sequence completed")
    );
    behaviorSubject.onNext(3);
    behaviorSubject.onNext(4);
    behaviorSubject.onNext(5);
    behaviorSubject.onComplete();

    System.out.println("--- BehaviorSubject");
    ReplaySubject<Integer> replaySubject = ReplaySubject.create();
    replaySubject.subscribe(
        integer -> System.out.println("first: next item is " + integer),
        integer -> System.out.println("first: error - " + integer),
        () -> System.out.println("first: sequence completed")
    );
    replaySubject.onNext(1);
    replaySubject.onNext(2);
    replaySubject.subscribe(
        integer -> System.out.println("second: next item is " + integer),
        integer -> System.out.println("second: error - " + integer),
        () -> System.out.println("second: sequence completed")
    );
    replaySubject.onNext(3);
    replaySubject.onNext(4);
    replaySubject.onNext(5);
    replaySubject.onComplete();

    System.out.println("--- AsyncSubject");
    AsyncSubject<Integer> asyncSubject = AsyncSubject.create();
    asyncSubject.subscribe(
        integer -> System.out.println("first: next item is " + integer),
        integer -> System.out.println("first: error - " + integer),
        () -> System.out.println("first: sequence completed")
    );
    asyncSubject.onNext(1);
    asyncSubject.onNext(2);
    asyncSubject.subscribe(
        integer -> System.out.println("second: next item is " + integer),
        integer -> System.out.println("second: error - " + integer),
        () -> System.out.println("second: sequence completed")
    );
    asyncSubject.onNext(3);
    asyncSubject.onNext(4);
    asyncSubject.onNext(5);
    asyncSubject.onComplete();
  }
}
