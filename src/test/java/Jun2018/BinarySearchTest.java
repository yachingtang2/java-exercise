package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
  private BinarySearch binarySearch = new BinarySearch();

  @Test
  public void search_two() {
    int[] array = {2,4,6,8,10};

    int index = binarySearch.search(array, 2);

    assertEquals(0, index);
  }

  @Test
  public void search_four() {
    int[] array = {2,4,6,8,10};

    int index = binarySearch.search(array, 4);

    assertEquals(1, index);
  }

  @Test
  public void search_six() {
    int[] array = {2,4,6,8,10};

    int index = binarySearch.search(array, 6);

    assertEquals(2, index);
  }

  @Test
  public void search_eight() {
    int[] array = {2,4,6,8,10};

    int index = binarySearch.search(array, 8);

    assertEquals(3, index);
  }

  @Test
  public void search_ten() {
    int[] array = {2,4,6,8,10};

    int index = binarySearch.search(array, 10);

    assertEquals(4, index);
  }

  @Test
  public void search_one() {
    int[] array = {2,4,6,8,10};

    int index = binarySearch.search(array, 1);

    assertEquals(-1, index);
  }
}
