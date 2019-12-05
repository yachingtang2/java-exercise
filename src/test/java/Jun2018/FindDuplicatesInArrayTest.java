package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindDuplicatesInArrayTest {
  private FindDuplicatesInArray findDuplicatesInArray = new FindDuplicatesInArray();

  @Test
  void findDuplicate_one_element() {
    int[] array = {2};
    int[] expectedArray = {-1};

    int[] duplicates = findDuplicatesInArray.findDuplicate(array);

    assertArrayEquals(expectedArray, duplicates);
  }

  @Test
  void findDuplicate_two_elements() {
    int[] array = {2,2};
    int[] expectedArray = {2, 0};

    int[] duplicates = findDuplicatesInArray.findDuplicate(array);

    assertArrayEquals(expectedArray, duplicates);
  }

  @Test
  void findDuplicate_three_elements() {
    int[] array = {2,2,2};
    int[] expectedArray = {2,0,0};

    int[] duplicates = findDuplicatesInArray.findDuplicate(array);

    assertArrayEquals(expectedArray, duplicates);
  }

  @Test
  void findDuplicate_five_elements() {
    int[] array = {2,3,1,2,3};
    int[] expectedArray = {2,3,0,0,0};

    int[] duplicates = findDuplicatesInArray.findDuplicate(array);

    assertArrayEquals(expectedArray, duplicates);
  }

  @Test
  void findDuplicate_six_elements() {
    int[] array = {1,2,3,1,2,3};
    int[] expectedArray = {1,2,3,0,0,0};

    int[] duplicates = findDuplicatesInArray.findDuplicate(array);

    assertArrayEquals(expectedArray, duplicates);
  }
}
