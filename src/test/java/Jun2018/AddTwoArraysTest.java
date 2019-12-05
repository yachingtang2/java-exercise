package Jun2018;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoArraysTest {
  private AddTwoArrays addTwoArrays = new AddTwoArrays();
  
  @Test
  public void arrayOf3() {
    int[] a = {3,9,8};
    int[] b = {8,12,74};
    int[] expected = {11,21,82};

    int[] sum = addTwoArrays.add(a, b);
    assertEquals(Arrays.toString(expected), Arrays.toString(sum));
  }
}
