package Nov2019;

import java.util.*;

public class SumOfTwoNumbersInArray {
  public boolean findNumbers(Integer[] array, int sum) {
    if(array == null || array.length == 0) {
      return false;
    }
    Set<Integer> arraySet = new TreeSet<>(Arrays.asList(array));

    for(Integer number : arraySet) {
      int otherNumber = sum - number;

      if(otherNumber == number) {
        return false;
      }
      boolean isNumberFound = arraySet.stream()
          .anyMatch(value -> value == otherNumber);
      if(isNumberFound) {
        return true;
      }
    }

    return false;
  }

  public int[] findIndexes(int[] array, int target) {
    if(array == null || array.length == 0) {
      return new int[0];
    }

    Map<Integer, Integer> arrayMap = new LinkedHashMap<>();

    for(int i = 0; i < array.length; i++) {
      int numberToFind = target - array[i];
      if(arrayMap.containsKey(numberToFind)) {
        int[] resultArray = new int[] {i, arrayMap.get(numberToFind)};
        Arrays.sort(resultArray);
        return resultArray;
      }
      arrayMap.put(array[i], i);
    }

    return null;


//    Arrays.sort(array);
//    for(int i = 0; i < array.length; i++) {
//      for(int j = i+1; j < array.length; j++) {
//        if(array[i] + array[j] == target) {
//          return new int[] {i, j};
//        }
//      }
//    }
//
//    return null;
  }
}
