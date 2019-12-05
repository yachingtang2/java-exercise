package Jun2018;// Java program to demonstrate Implementation of
// functional interface using lambda expressions

public class ThreadLambdaExpression
{
  public static void main(String args[])
  {

    // lambda expression to create the object
    new Thread(()->
        System.out.println("New thread created")).start();

    ThreadTest tt = new ThreadTest();

    tt.startThread();
  }
}


class ThreadTest {
  void startThread() {
    new Thread(() -> System.out.println("My Thread created")).start();
  }
}