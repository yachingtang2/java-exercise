package Nov2019;

import java.util.Arrays;

class BinarySearch {
  boolean find(int[] numbers, int numberToFind) {
    Arrays.sort(numbers);

    int high = numbers.length - 1;
    int low = 0;
    int medium;

    while(high >= low) {
      medium = (high + low) / 2;

      if(numberToFind > numbers[medium]) {
        low = medium + 1;
      } else if (numberToFind < numbers[medium]) {
        high = medium - 1;
      } else if (numberToFind == numbers[medium]) {
        return true;
      }
    }

    return false;
























//    Arrays.sort(numbers);
//
//    int high = numbers.length - 1;
//    int low = 0;
//    int middle;
//
//    while(low <= high) {
//      middle = (high + low) / 2;
//
//      if(numberToFind < numbers[middle]) {
//        high = middle - 1;
//      } else if (numberToFind > numbers[middle]) {
//        low = middle + 1;
//      } else if (numberToFind == numbers[middle]) {
//        return true;
//      }
//    }
//
//    return false;





























//    Arrays.sort(numbers);
//    int low = 0;
//    int high = numbers.length - 1;
//    int middle;
//
//    while(low <= high) {
//      middle = (low + high + 1) / 2;
//      if(numbers[middle] > numberToFind) {
//        high = middle - 1;
//      }
//      else if(numbers[middle] < numberToFind) {
//        low = middle + 1;
//      }
//      else if(numbers[middle] == numberToFind) {
//        return true;
//      }
//    }
//    return false;
  }
}
