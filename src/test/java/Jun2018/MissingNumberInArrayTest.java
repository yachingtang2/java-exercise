package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberInArrayTest {
  private MissingNumberInArray missingNumberInArray = new MissingNumberInArray();

  @Test
  public void missing_one() {
    int[] array = {2,3,4,5};
    int result = missingNumberInArray.findMissingNumber(array);

    assertEquals(1, result);
  }

  @Test
  public void missing_two() {
    int[] array = {1,3,4,5};
    int result = missingNumberInArray.findMissingNumber(array);

    assertEquals(2, result);
  }

  @Test
  public void missing_three() {
    int[] array = {1,2,4,5};
    int result = missingNumberInArray.findMissingNumber(array);

    assertEquals(3, result);
  }

  @Test
  public void missing_four() {
    int[] array = {1,2,3,5};
    int result = missingNumberInArray.findMissingNumber(array);

    assertEquals(4, result);
  }

  @Test
  public void missing_five() {
    int[] array = {1,2,3,4};
    int result = missingNumberInArray.findMissingNumber(array);

    assertEquals(5, result);
  }
}
