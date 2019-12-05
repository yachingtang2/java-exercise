package Jun2018;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinMaxInArrayTest {
  private MinMaxInArray minMaxInArray = new MinMaxInArray();

  @Test
  void minMax_one_element() {
    int[] array = {1};

    minMaxInArray.findMinMax(array);

    Assertions.assertEquals(1, minMaxInArray.getMin());
    Assertions.assertEquals(1, minMaxInArray.getMax());
  }

  @Test
  void minMax_two_elements() {
    int[] array = {1,3};

    minMaxInArray.findMinMax(array);

    Assertions.assertEquals(1, minMaxInArray.getMin());
    Assertions.assertEquals(3, minMaxInArray.getMax());
  }

  @Test
  void minMax_three_elements() {
    int[] array = {1,3,5};

    minMaxInArray.findMinMax(array);

    Assertions.assertEquals(1, minMaxInArray.getMin());
    Assertions.assertEquals(5, minMaxInArray.getMax());
  }

  @Test
  void minMax_four_elements() {
    int[] array = {5,2,7,10};

    minMaxInArray.findMinMax(array);

    Assertions.assertEquals(2, minMaxInArray.getMin());
    Assertions.assertEquals(10, minMaxInArray.getMax());
  }

  @Test
  void minMax_five_elements() {
    int[] array = {1,345,234,21,56789};

    minMaxInArray.findMinMax(array);

    Assertions.assertEquals(1, minMaxInArray.getMin());
    Assertions.assertEquals(56789, minMaxInArray.getMax());
  }

  @Test
  void minMax_six_elements() {
    int[] array = {3,2,1,56,10000,167};

    minMaxInArray.findMinMax(array);

    Assertions.assertEquals(1, minMaxInArray.getMin());
    Assertions.assertEquals(10000, minMaxInArray.getMax());
  }
}
