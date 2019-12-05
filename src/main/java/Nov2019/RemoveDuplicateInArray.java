package Nov2019;

import java.util.*;

class RemoveDuplicateInArray {
  public int[] filter(int[] array) {
    Set<Integer> integerSet = new LinkedHashSet<>();

    for(int i = 0; i < array.length; i++) {
      integerSet.add(array[i]);
    }

    int[] filteredArray = new int[integerSet.size()];

    int index = 0;
    for(int number : integerSet) {
      filteredArray[index++] = number;
    }

    return filteredArray;
  }
}
