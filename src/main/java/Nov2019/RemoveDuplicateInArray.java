package Nov2019;

import java.util.*;

class RemoveDuplicateInArray {
  public Object[] filter(int[] array) {
    Set<Integer> duplicateRemoved = new TreeSet<>();
    for (int number : array) {
      duplicateRemoved.add(number);
    }

//    int[] noDuplicateArray = new int[duplicateRemoved.size()];

    return duplicateRemoved.toArray();
  }
}



















//    Set<Integer> integerSet = new LinkedHashSet<>();
//
//    for(int i = 0; i < array.length; i++) {
//      integerSet.add(array[i]);
//    }
//
//    int[] filteredArray = new int[integerSet.size()];
//
//    int index = 0;
//    for(int number : integerSet) {
//      filteredArray[index++] = number;
//    }
//
//    return filteredArray;
//  }
//}
