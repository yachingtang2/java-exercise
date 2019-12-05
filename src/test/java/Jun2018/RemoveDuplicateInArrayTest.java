package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveDuplicateInArrayTest {
  private RemoveDuplicateInArray removeDuplicateInArray = new RemoveDuplicateInArray();

  @Test
  void removeDuplicate_one_element() {
    int[] array = {1};
    int[] expectedArray = {1};

    int[] actualArray = removeDuplicateInArray.removeDuplicate(array);

    assertArrayEquals(expectedArray, actualArray);
  }

  @Test
  void removeDuplicate_two_elements() {
    int[] array = {1,1};
    int[] expectedArray = {1};

    int[] actualArray = removeDuplicateInArray.removeDuplicate(array);

    assertArrayEquals(expectedArray, actualArray);
  }

  @Test
  void removeDuplicate_three_elements() {
    int[] array = {1,1,1};
    int[] expectedArray = {1};

    int[] actualArray = removeDuplicateInArray.removeDuplicate(array);

    assertArrayEquals(expectedArray, actualArray);
  }

  @Test
  void removeDuplicate_four_elements() {
    int[] array = {1,1,1,2};
    int[] expectedArray = {1,2};

    int[] actualArray = removeDuplicateInArray.removeDuplicate(array);

    assertArrayEquals(expectedArray, actualArray);
  }
}
