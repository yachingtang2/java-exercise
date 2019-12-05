package Jun2018;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotatedSortedArraySearchTest {
  private RotatedSortedArraySearch rotatedSortedArraySearch = new RotatedSortedArraySearch();

  @Test
  public void searchIndexThree() {
    int[] array = {3,4,5,1,2};

    int result = rotatedSortedArraySearch.searchSmallestNumberIndex(array);

    assertEquals(3, result);
  }

  @Test
  public void searchIndexZero() {
    int[] array = {1,2,3,4,5};

    int result = rotatedSortedArraySearch.searchSmallestNumberIndex(array);

    assertEquals(0, result);
  }

  @Test
  public void searchIndexOne() {
    int[] array = {5,1,2,3,4};

    int result = rotatedSortedArraySearch.searchSmallestNumberIndex(array);

    assertEquals(1, result);
  }

  @Test
  public void searchIndexTwo() {
    int[] array = {4,5,1,2,3};

    int result = rotatedSortedArraySearch.searchSmallestNumberIndex(array);

    assertEquals(2, result);
  }

  @Test
  public void searchIndexFour() {
    int[] array = {2,3,4,5,1};

    int result = rotatedSortedArraySearch.searchSmallestNumberIndex(array);

    assertEquals(4, result);
  }

  @Disabled
  @Test
  public void searchIndexSix() {
    int[] array = {5,6,7,8,9,10,1,2,3};

    int result = rotatedSortedArraySearch.searchSmallestNumberIndex(array);

    assertEquals(6, result);
  }
}
