package Jun2018;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeftRotationTest {

  private LeftRotation leftRotation = new LeftRotation();

  @Test
  public void rotateFour() {
    int[] array = {1,2,3,4,5};
    int[] rotatedArray = {5,1,2,3,4};

    int[] result = leftRotation.rotate(array, 4);

    assertTrue(Arrays.equals(rotatedArray, result));
  }

  @Test
  public void rotateNine() {
    int[] array = {1,2,3,4,5};
    int[] rotatedArray = {5,1,2,3,4};

    int[] result = leftRotation.rotate(array, 9);

    assertTrue(Arrays.equals(rotatedArray, result));
  }

  @Test
  public void rotateOne() {
    int[] array = {1,2,3,4,5};
    int[] rotatedArray = {2,3,4,5,1};

    int[] result = leftRotation.rotate(array, 1);

    assertTrue(Arrays.equals(rotatedArray, result));
  }

  @Test
  public void rotateTwo() {
    int[] array = {1,2,3,4,5};
    int[] rotatedArray = {3,4,5,1,2,};

    int[] result = leftRotation.rotate(array, 2);

    assertTrue(Arrays.equals(rotatedArray, result));
  }

  @Test
  public void rotateThree() {
    int[] array = {1,2,3,4,5};
    int[] rotatedArray = {4,5,1,2,3,};

    int[] result = leftRotation.rotate(array, 3);

    assertTrue(Arrays.equals(rotatedArray, result));
  }

  @Test
  public void rotateFive() {
    int[] array = {1,2,3,4,5};
    int[] rotatedArray = {1,2,3,4,5};

    int[] result = leftRotation.rotate(array, 5);

    assertTrue(Arrays.equals(rotatedArray, result));
  }
}
