package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayingWithNumbersTest {

  private PlayingWithNumbers playingWithNumbers = new PlayingWithNumbers();

  @Test
  public void oneToThree() {
    int[] array = {1,3,6,10,15};

    long result = playingWithNumbers.calculateMean(array, 1, 3);

    assertEquals(2, result);
  }

  @Test
  public void twoToFour() {
    int[] array = {1,3,6,10,15};

    long result = playingWithNumbers.calculateMean(array, 2, 4);

    assertEquals(3, result);
  }

  @Test
  public void twoToFive() {
    int[] array = {1,3,6,10,15};

    long result = playingWithNumbers.calculateMean(array, 2, 5);

    assertEquals(3, result);
  }
}
