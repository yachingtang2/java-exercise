package Jun2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
  public int[] sortAndGetIndex(int[] array) {
    int[] originalArray = Arrays.copyOf(array, array.length);
    int[] sortedArray = sort(array);

    List<Integer> sortedArrayList = convertOriginalToList(sortedArray);

    return getOriginalIndex(sortedArrayList, originalArray);
  }

  public int[] sort(int[] array) {
    for(int i = 0; i < array.length; i++) {
      int temp = array[i];
      int j = i;

      while(j > 0 && temp < array[j - 1]) {
        array[j] = array[j-1];
        j = j - 1;
      }

      array[j] = temp;
    }

    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    return array;
  }

  public int[] getOriginalIndex(List<Integer> sortedList, int[] originalArray) {
    int[] indexesArray = new int[originalArray.length];

    for(int i = 0; i < originalArray.length; i++) {
      int index = sortedList.indexOf(originalArray[i]);
      if(index >= 0) {
        indexesArray[i] = index + 1;
      }
    }

    return indexesArray;
  }

  private List<Integer> convertOriginalToList(int[] original) {
    List<Integer> originalList = new ArrayList<>();

    for(int i = 0; i < original.length; i++) {
      originalList.add(original[i]);
    }

    return originalList;
  }
}
