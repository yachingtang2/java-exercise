package Jun2018;

import java.util.ArrayList;
import java.util.List;

public class AddTwoArrays {
  public int[] add(int[] a, int[] b) {
    int[] sums = new int[3];

    for(int i = 0; i < a.length; i++) {
      System.out.print(sums[i] + " ");
      sums[i] = a[i] + b[i];
    }
    return sums;
  }
}
