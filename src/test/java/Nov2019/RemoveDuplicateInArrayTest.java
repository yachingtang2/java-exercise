package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RemoveDuplicateInArrayTest {
  private RemoveDuplicateInArray removeDuplicateInArray;

  @BeforeEach
  void setUp() {
    removeDuplicateInArray = new RemoveDuplicateInArray();
  }

  @Test
  void noDuplicate() {
    int[] array = {1,2,3,4,5};
    Object[] filteredArray = removeDuplicateInArray.filter(array);
    assertThat(filteredArray, is(array));
  }

  @Test
  void remove1Duplicate() {
    int[] array = {1,2,1,3};
    int[] expectedArray = {1,2,3};
    Object[] filteredArray = removeDuplicateInArray.filter(array);
    assertThat(filteredArray, is(expectedArray));
  }

  @Test
  void remove4Duplicates() {
    int[] array = {1,1,1,1,1};
    int[] expectedArray = {1};
    Object[] filteredArray = removeDuplicateInArray.filter(array);
    assertThat(filteredArray, is(expectedArray));
  }

  @Test
  void remove2Duplicates() {
    int[] array = {1,5,5,1};
    int[] expectedArray = {1,5};
    Object[] filteredArray = removeDuplicateInArray.filter(array);
    assertThat(filteredArray, is(expectedArray));
  }
}
