package Jun2018;

import java.util.Arrays;

public class ContainNumber {
  public boolean contain(int number) {
    int[] array = {0,3,1,2};

    Arrays.sort(array);

    return binarySearch(array, number);
  }

  private boolean binarySearch(int[] array, int number) {
    int low = 0;
    int high = array.length-1;

    while(low <= high) {
      int middle = low + (high - 1) / 2;

      if(array[middle] == number) {
        return true;
      } else if (array[middle] > number) {
        high = middle - 1;
      } else {
        low = middle + 1;
      }
    }
    return false;
  }
}

// 0123
// m = 0 + 2/2 = 1
// h = 0
// l = 0, h = 0, m = 0 + -1/2;