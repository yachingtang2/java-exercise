package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

class FindDuplicateInArrayTest {
  private FindDuplicateInArray findDuplicateInArray;

  @BeforeEach
  void setUp() {
    findDuplicateInArray = new FindDuplicateInArray();
  }

  @Test
  void noDuplicate1() {
    int[] array = {1, 3, 5, 6};
    var duplicates = findDuplicateInArray.find(array);
    assertThat(duplicates.size(), is(0));
  }

  @Test
  void duplicate1() {
    int[] array = {1, 3, 5, 2, 1, 6};
    var duplicates = findDuplicateInArray.find(array);
    assertThat(duplicates, contains(1));
  }

  @Test
  void duplicate2() {
    int[] array = {1, 3, 1, 2, 3, 6};
    var duplicates = findDuplicateInArray.find(array);
    assertThat(duplicates, contains(1,3));
  }

  @Test
  void duplicate3() {
    int[] array = {1, 3, 1, 6, 3, 6};
    var duplicates = findDuplicateInArray.find(array);
    assertThat(duplicates, contains(1,3,6));
  }

  @Test
  void duplicateSameNumber3Times() {
    int[] array = {1,2,1,3,1,8};
    var duplicates = findDuplicateInArray.find(array);
    assertThat(duplicates, contains(1));
  }

  @Test
  void duplicateAll() {
    int[] array = {5,5,5,5,5,5};
    var duplicates = findDuplicateInArray.find(array);
    assertThat(duplicates, contains(5));
  }

  @Test
  void duplicate42() {
    int[] array = {4, 2, 4, 5, 2, 3, 1};
    var duplicates = findDuplicateInArray.find(array);
    assertThat(duplicates, contains(4, 2));
  }
}
