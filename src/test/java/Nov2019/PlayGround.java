package Nov2019;

import java.util.*;

public class PlayGround {
  public static void main(String[] args) {
    String[] cities =
        {"Bangalore", "Pune", "San Francisco", "New York City"};
    MySort ms = new MySort();
    Arrays.sort(cities, ms);
    System.out.println(Arrays.binarySearch(cities,"New York City", ms));

//    int[] array = {5,3,1,2};
//    Arrays.sort(array);
//    System.out.println(Arrays.binarySearch(array, 2));
  }

  static class MySort implements Comparator<String> {
    public int compare(String a, String b) {
      return b.compareTo(a);
    }
  }
}

abstract class DEF {
  private int id;
  private int getId() {
    return 0;
  }
}
abstract class ABC extends DEF {
  abstract int getCount();
  abstract int getVale();
}
