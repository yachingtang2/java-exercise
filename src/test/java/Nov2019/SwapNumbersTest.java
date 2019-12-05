package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class SwapNumbersTest {
  private SwapNumbers swapNumbers;

  @BeforeEach
  void setUp() {
    swapNumbers = new SwapNumbers();
  }

  @Test
  void swap10And20() {
    assertThat(swapNumbers.swap(10, 20), contains(20, 10));
  }

  @Test
  void swap15And3() {
    assertThat(swapNumbers.swap(15, 3), contains(3, 15));
  }
}
