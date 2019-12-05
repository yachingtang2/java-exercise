package Jun2018;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonkSearchTest {

  private MonkSearch monkSearch = new MonkSearch();

  @Test
  public void searchNotLessThanZero() {
    int[] array = {1,2,3,4};
    Arrays.sort(array);
    int result = monkSearch.searchNotLessThan(array,5);

    assertEquals(0, result);
  }

  @Test
  public void searchNotLessThanTwo() {
    int[] array = {1,2,3,4};
    Arrays.sort(array);
    int result = monkSearch.searchNotLessThan(array,3);

    assertEquals(2, result);
  }

  @Test
  public void searchGreaterThanZero() {
    int[] array = {1,2,3,4};
    Arrays.sort(array);
    int result = monkSearch.searchGreaterThan(array, 5);

    assertEquals(0, result);
  }

  @Test
  public void searchGreaterThanOne() {
    int[] array = {1,2,3,4};
    Arrays.sort(array);
    int result = monkSearch.searchGreaterThan(array, 3);

    assertEquals(1, result);
  }

  @Test
  public void searchGreaterThanThree() {
    int[] array = {1,2,3,4};
    Arrays.sort(array);
    int result = monkSearch.searchGreaterThan(array, 1);

    assertEquals(3, result);
  }

  @Test
  public void searchGreaterThanSix() {
    int[] array = {10,10,10,10,10};
    Arrays.sort(array);
    int result = monkSearch.searchGreaterThan(array, 6);

    assertEquals(5, result);
  }
}
