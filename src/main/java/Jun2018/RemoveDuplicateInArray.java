package Jun2018;

import java.util.*;

public class RemoveDuplicateInArray {
  public int[] removeDuplicate(int[] array) {
    Set<Integer> noDuplicate = new HashSet<>();

    for(int i = 0; i < array.length; i++) {
      noDuplicate.add(array[i]);
    }

    int[] noDuplicateArray = new int[noDuplicate.size()];
    int count = 0;

    for(int number : noDuplicate) {
      noDuplicateArray[count++] = number;
    }
    return noDuplicateArray;
  }
}
