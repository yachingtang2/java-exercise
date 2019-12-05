package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoDArrayTest {
  private TwoDArray twoDArray = new TwoDArray();

  @Test
  public void firstHourGlass() {
    int[][] array = {
      {1,1,1,0,0,0},
      {0,1,0,0,0,0},
      {1,1,1,0,0,0},
      {0,0,0,0,0,0},
      {0,0,0,0,0,0},
      {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 0, 0);
    int expected = 7;
    assertEquals(expected, result);
  }

  @Test
  public void secondHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 0, 1);
    int expected = 4;
    assertEquals(expected, result);
  }

  @Test
  public void thirdHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 0, 2);
    int expected = 2;
    assertEquals(expected, result);
  }

  @Test
  public void fourthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 0, 3);
    int expected = 0;
    assertEquals(expected, result);
  }

  @Test
  public void fifthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 1, 0);
    int expected = 2;
    assertEquals(expected, result);
  }

  @Test
  public void sixthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 1, 1);
    int expected = 2;
    assertEquals(expected, result);
  }

  @Test
  public void seventhHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 1, 2);
    int expected = 0;
    assertEquals(expected, result);
  }

  @Test
  public void eighthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 1, 3);
    int expected = 0;
    assertEquals(expected, result);
  }

  @Test
  public void ninthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 2, 0);
    int expected = 3;
    assertEquals(expected, result);
  }

  @Test
  public void tenthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 2, 1);
    int expected = 2;
    assertEquals(expected, result);
  }

  @Test
  public void eleventhHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 2, 2);
    int expected = 1;
    assertEquals(expected, result);
  }

  @Test
  public void twelvthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 2, 3);
    int expected = 0;
    assertEquals(expected, result);
  }

  @Test
  public void thirteenthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 3, 0);
    int expected = 0;
    assertEquals(expected, result);
  }

  @Test
  public void fourteenthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 3, 1);
    int expected = 0;
    assertEquals(expected, result);
  }

  @Test
  public void fifteenthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 3, 2);
    int expected = 0;
    assertEquals(expected, result);
  }

  @Test
  public void sixteenthHourGlass() {
    int[][] array = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0},
        {0,0,0,0,0,0}
    };
    int result = twoDArray.hourGlassSum(array, 3, 3);
    int expected = 0;
    assertEquals(expected, result);
  }
}
