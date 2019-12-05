package Jun2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AccessModifier {
  private static int sum = 0;

  private int getSum() {
    return this.sum;
  }

  static void calculate(int a, int b) {
    sum = a + b;
  }

  public static void main(String[] args) {

    calculate(5, 7);
    System.out.println("Hello World, " + sum);

    Testing testing = new Testing();
    System.out.println("Result = " + testing.getAccessModifierSum());

    Map<String, Integer> myMap = new HashMap<>();
    myMap.put("a", 10);
    myMap.put("a", 15);
    myMap.put(null, 3);
    System.out.println("myMap = " + myMap.toString());

    List<Integer> myList = new ArrayList<>();
    myList.add(8);
    System.out.println("hasNext = " + myList.iterator().hasNext());
    System.out.println("hasNext = " + myList.iterator().next());

    new Thread(new HelloRunnable()).start();
    new HelloThread().start();
  }
}

class Testing {
  private AccessModifier accessModifier;

  int getAccessModifierSum() {
    return 5;
  }
}

class HelloRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("Hello from a thread!");
  }
}

class HelloThread extends Thread {
  public void run() {
    System.out.println("Hello from Jun2018.HelloThread");
  }
}