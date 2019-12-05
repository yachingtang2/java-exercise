package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseArrayTest {
  private ReverseArray reverseArray = new ReverseArray();

  @Test
  void reverse_one_element() {
    int[] array = {1};

    int[] actualArray = reverseArray.reverse(array);

    assertArrayEquals(array, actualArray);
  }

  @Test
  void reverse_two_elements() {
    int[] array = {1,1};

    int[] actualArray = reverseArray.reverse(array);

    assertArrayEquals(array, actualArray);
  }

  @Test
  void reverse_three_elements() {
    int[] array = {1,2,3};
    int[] expectedArray = {3,2,1};

    int[] actualArray = reverseArray.reverse(array);

    assertArrayEquals(expectedArray, actualArray);
  }

  @Test
  void reverse_three_elements_121() {
    int[] array = {1,2,1};
    int[] expectedArray = {1,2,1};

    int[] actualArray = reverseArray.reverse(array);

    assertArrayEquals(expectedArray, actualArray);
  }


  @Test
  void reverse_four_elements() {
    int[] array = {1,2,100,2000};
    int[] expectedArray = {2000,100,2,1};

    int[] actualArray = reverseArray.reverse(array);

    assertArrayEquals(expectedArray, actualArray);
  }
}