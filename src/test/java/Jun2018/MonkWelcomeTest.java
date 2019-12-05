package Jun2018;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonkWelcomeTest {
  private MonkWelcome monkWelcome = new MonkWelcome();

  @Test
  public void sumUpOne() {
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {4,5,3,2,10};
    int[] expected = {5,7,6,6,15};

    int[] sums = monkWelcome.sum(array1, array2);
    assertEquals(Arrays.toString(expected), Arrays.toString(sums));
  }

  @Test
  public void sumUpTwo() {
    int[] array1 = {-1,100,200,3000};
    int[] array2 = {-2,1000,2000,30000};
    int[] expected = {-3,1100,2200,33000};

    int[] sums = monkWelcome.sum(array1, array2);
    assertEquals(Arrays.toString(expected), Arrays.toString(sums));
  }
}
