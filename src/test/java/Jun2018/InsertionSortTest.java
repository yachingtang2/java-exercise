package Jun2018;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortTest {
  private InsertionSort insertionSort = new InsertionSort();

  @Test
  public void sortNothing() {
    int[] array = {1,2,3,4,5};

    int[] sortedArray = insertionSort.sortAndGetIndex(array);

    assertEquals(true, Arrays.equals(array, sortedArray));
  }

  @Test
  public void sortOne() {
    int[] array = {2,1,3,4,5};
    int[] expectedIndexes = {2,1,3,4,5};

    int[] actualIndexes = insertionSort.sortAndGetIndex(array);

    assertEquals(true, Arrays.equals(expectedIndexes, actualIndexes));
  }

  @Test
  public void sortMultiple() {
    int[] array = {5,4,2,1,3};
    int[] expectedArray = {5,4,2,1,3};

    int[] sortedArray = insertionSort.sortAndGetIndex(array);

    assertEquals(true, Arrays.equals(expectedArray, sortedArray));
  }

  @Test
  public void sortFifty() {
    int[] array = {66,83,29,26,12,3,90,6,68,28,82,58,9,21,22,39,52,1,70,31,15,99,94,50,20,77,48,76,5,87,67,78,69,49,63,57,96,43,79,97,18,100,92,91,14,80,46,61,33,74};

    int[] expectedArray = {29,41,15,13,6,2,43,4,31,14,40,26,5,11,12,18,24,1,33,16,8,49,46,23,10,36,21,35,3,42,30,37,32,22,28,25,47,19,38,48,9,50,45,44,7,39,20,27,17,34};

    int[] sortedArray = insertionSort.sortAndGetIndex(array);

    assertEquals(true, Arrays.equals(expectedArray, sortedArray));

  }

}