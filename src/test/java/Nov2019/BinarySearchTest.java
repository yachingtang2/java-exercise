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
}
