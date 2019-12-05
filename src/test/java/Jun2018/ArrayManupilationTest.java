package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayManupilationTest {

  private ArrayManipulation arrayManipulation = new ArrayManipulation();

  @Test
  public void arrayOf5() {
    int[][] array = {{1,2,100}, {2,5,100}, {3,4,100}};

    long result = arrayManipulation.manipulate(5, array);

    assertEquals(200, result);
  }

  @Test
  public void arrayOf10() {
    int[][] array = {{1,5,3}, {4,8,7}, {6,9,1}};

    long result = arrayManipulation.manipulate(10, array);

    assertEquals(10, result);
  }
}
