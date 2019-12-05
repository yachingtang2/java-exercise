package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSwaps2Test {
  private MinimumSwaps2 swap = new MinimumSwaps2();

  @Test
  public void SwapOne() {
    int[] array = {2,1};

    int count = swap.count(array);

    assertEquals(1, count);
  }

  @Test
  public void SwapThree() {
    int[] array = {4,3,1,2};

    int count = swap.count(array);

    assertEquals(3, count);
  }

  @Test
  public void SwapThreeTwo() {
    int[] array = {2,3,4,1,5};

    int count = swap.count(array);

    assertEquals(3, count);
  }

  @Test
  public void SwapThreeThree() {
    int[] array = {1,3,5,2,4,6,8};

    int count = swap.count(array);

    assertEquals(3, count);
  }
}
