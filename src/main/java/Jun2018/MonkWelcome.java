package Jun2018;

public class MonkWelcome {

  public int[] sum(int[] array1, int[] array2) {
    int[] sums = new int[array1.length];

    for(int i = 0; i < array1.length; i++) {
      sums[i] = array1[i] + array2[i];
    }

    return sums;
  }
}
