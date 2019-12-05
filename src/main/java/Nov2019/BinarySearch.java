package Nov2019;

import java.util.Arrays;

class BinarySearch {
  boolean find(int[] numbers, int numberToFind) {
    Arrays.sort(numbers);
    int low = 0;
    int high = numbers.length - 1;
    int middle;

    while(low <= high) {
      middle = (low + high + 1) / 2;
      if(numbers[middle] > numberToFind) {
        high = middle - 1;
      }
      else if(numbers[middle] < numberToFind) {
        low = middle + 1;
      }
      else if(numbers[middle] == numberToFind) {
        return true;
      }
    }
    return false;
  }
}
