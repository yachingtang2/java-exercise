package Jun2018;

public class TimeComplexity {

  public int count(int limit) {
    int count = 0;
    for (int i = 0; i < limit; i++) {
      for (int j = 0; j < i; j++) {
        count++;
        System.out.println("1 - " + i + "," + j + "," + count);
      }
    }

    return count;
  }

  public int count2(int limit) {
    int count = 0;
    for (int i = limit; i > 0; i /= 2) {
      for (int j = 0; j < i; j++) {
        count++;
        System.out.println("2 - " + i + "," + j + "," + count);
      }
    }

    return count;
  }
}
