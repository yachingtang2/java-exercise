package Jun2018;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagicSquareTest {
  private MagicSquare magicSquare = new MagicSquare();

  @Test
  public void formingMagicSquare1() {
    int[][] numbers = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
    int cost = magicSquare.formingMagicSquare(numbers);
    int expected = 7;

    assertEquals(expected, cost);
  }

  @Test
  public void formingMagicSquare2() {
    int[][] numbers = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
    int cost = magicSquare.formingMagicSquare(numbers);
    int expected = 7;

    assertEquals(expected, cost);
  }

  @Test
  public void formingMagicSquare3() {
    int[][] numbers = {{4,8,2}, {4,5,7}, {6,1,6}};
    int cost = magicSquare.formingMagicSquare(numbers);
    int expected = 4;

    assertEquals(expected, cost);
  }
}

