package Jun2018;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {
  private BubbleSort bubbleSort = new BubbleSort();

  @BeforeEach
  void setUp() {
    BubbleSort.resetSwapCount();
  }

  @Test
  public void sortNothing() {
    int[] array = {1,2,3,4,5};
    int result = BubbleSort.sort(array, 5);

    assertEquals(0, result);
  }

  @Test
  public void sortOneSwap() {
    int[] array = {2,1,3,4,5};
    int result = BubbleSort.sort(array, 5);

    assertEquals(1, result);
  }

  @Test
  public void sortTwoSwaps() {
    int[] array = {2,1,4,3,5};
    int result = BubbleSort.sort(array, 5);

    assertEquals(2, result);
  }

  @Test
  public void sortThreeSwaps() {
    int[] array = {2,1,5,3,4};
    int result = BubbleSort.sort(array, 5);

    assertEquals(3, result);
  }

  @Test
  public void manySwaps() {
    int[] array = {27,81,85,85,71,76,69,87,42,39,100,95,65,25,88,62,6,15,44,40,72,7,59,79,29,40,29,33,86,49,30,60,85,31,40,74,19,10,94,54,40,55,12,7,80,6,74,48,85,25,72,77,100,10,67,65,34,79,51,88,71,60,22,96,24,65,6,14,18,92,7,91,12,71,45,2,13,75,23,21,15,52,95,47,43,17,51,84,65,2,6,36,15,67,55,97,26,76,17,1};
    int result = BubbleSort.sort(array, 100);

    assertEquals(2799, result);
  }
}
