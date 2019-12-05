package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonkInversionTest {
  private MonkInversion monkInversion = new MonkInversion();

  @Test
  public void countNoInversion() {
    int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
    int result = monkInversion.count(array);

    assertEquals(0, result);
  }

  @Test
  public void countTwoInversions() {
    int[][] array = {{4,3}, {1,4}};
    int result = monkInversion.count(array);

    assertEquals(2, result);
  }

  @Test
  public void countThreeInversions() {
    int[][] array = {{3,2,3}, {1,5,6}, {1,8,9}};
    int result = monkInversion.count(array);

    assertEquals(3, result);
  }

  @Test
  public void countSixInversions() {
    int[][] array = {{1,2,3,4}, {8,7,6,5}, {9,10,11,12}, {13,14,15,16}};
    int result = monkInversion.count(array);

    assertEquals(6, result);
  }
}
