package Jun2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoDArray2 {
  public int hourGlassSum(int[][] arr) {
    List<Integer> sums = new ArrayList<>();
    for(int i = 0; i < arr.length-2; i++) {
      for(int j = 0; j < arr[i].length-2; j++) {
        int sum = getSum(arr, i, j);
        System.out.println("sum = " + sum);
        sums.add(sum);
      }
    }
    Collections.sort(sums);
    return sums.get(sums.size()-1);
  }

  private int getSum(int[][] arr, int x, int y) {
    int sum = 0;
    for(int i = x; i <= x+2; i++) {
      for(int j = y; j <= y+2; j++) {
        if(i == x + 1 && (j == y || j == y+2)) {
          System.out.println("exception = " + i + ", " + j);
          continue;
        }
        else {
          System.out.println(i + ", " + j);
          sum += arr[i][j];
        }
      }
    }
    return sum;
  }
}
