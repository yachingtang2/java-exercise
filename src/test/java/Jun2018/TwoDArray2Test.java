package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoDArray2Test {
  private TwoDArray2 twoDArray = new TwoDArray2();

  @Test
  public void maxSum() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array);
    int expected = 7;
    assertEquals(expected, result);
  }

  @Test
  public void maxSum2() {
    int[][] array = {
        {-9, -9, -9, 1, 1, 1},
        {0, -9, 0, 4, 3, 2},
        {-9, -9, -9, 1, 2, 3},
        {0, 0, 8, 6, 6, 0},
        {0, 0, 0, -2, 0, 0},
        {0, 0, 1, 2, 4, 0}
    };
    int result = twoDArray.hourGlassSum(array);
    int expected = 28;
    assertEquals(expected, result);
  }

  @Test
  public void maxSum3() {
    int[][] array = {
        {1, 1, 1, 0, 0, 0},
        {0, 1, 0, 0, 0, 0},
        {1, 1, 1, 0, 0, 0},
        {0, 0, 2, 4, 4, 0},
        {0, 0, 0, 2, 0, 0},
        {0, 0, 1, 2, 4, 0}
    };
    int result = twoDArray.hourGlassSum(array);
    int expected = 19;
    assertEquals(expected, result);
  }
}
