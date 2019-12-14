package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BinarySearchTest {
  private BinarySearch binarySearch;

  @BeforeEach
  void setUp() {
    binarySearch = new BinarySearch();
  }

  @Test
  void numberFound1True() {
    int[] numbers = {1};
    assertThat(binarySearch.find(numbers, 1), is(true));
  }

  @Test
  void numberFound2True() {
    int[] numbers = {2,3};
    assertThat(binarySearch.find(numbers, 2), is(true));
  }

  @Test
  void numberFound4True() {
    int[] numbers = {2,3,4};
    assertThat(binarySearch.find(numbers, 4), is(true));
  }

  @Test
  void numberFound5False() {
    int[] numbers = {2,3,4};
    assertThat(binarySearch.find(numbers, 5), is(false));
  }

  @Test
  void numberFound8False() {
    int[] numbers = {9, 7, 2, 3, 4, 6};
    assertThat(binarySearch.find(numbers, 8), is(false));
  }

  @Test
  void numberFound8True() {
    int[] numbers = {9, 7, 2, 3, 4, 8};
    assertThat(binarySearch.find(numbers, 8), is(true));
  }

  @Test
  void numberFound3True() {
    int[] numbers = {9, 7, 2, 3, 4, 8};
    assertThat(binarySearch.find(numbers, 3), is(true));
  }
}
