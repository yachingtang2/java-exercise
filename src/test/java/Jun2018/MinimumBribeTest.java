package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumBribeTest {

  private MinimumBribe minimumBribe = new MinimumBribe();

  @Test
  public void brideThree() {
    int[] array = {2,1,5,3,4};

    int result = minimumBribe.count(array);

    assertEquals(3, result);
  }

  @Test
  public void brideTooChaotic() {
    int[] array = {2,5,1,3,4};

    int result = minimumBribe.count(array);

    assertEquals(-1, result);
  }

  @Test
  public void brideNone() {
    int[] array = {1,2,3,4,5};

    int result = minimumBribe.count(array);

    assertEquals(0, result);
  }

  @Test
  public void brideSeven() {
    int[] array = {1,2,5,3,7,8,6,4};

    int result = minimumBribe.count(array);

    assertEquals(7, result);
  }
}
