package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SumOfTwoNumbersInArrayTest {
  private SumOfTwoNumbersInArray sumOfTwoNumbersInArray;

  @BeforeEach
  void setUp() {
    sumOfTwoNumbersInArray = new SumOfTwoNumbersInArray();
  }

  @Test
  void sum3False() {
    Integer[] array = {1};
    assertThat(sumOfTwoNumbersInArray.findNumbers(array, 3), is(false));
  }

  @Test
  void sum3True() {
    Integer[] array = {1, 2};
    assertThat(sumOfTwoNumbersInArray.findNumbers(array, 3), is(true));
  }

  @Test
  void sum2False() {
    Integer[] array = {1, 2};
    assertThat(sumOfTwoNumbersInArray.findNumbers(array, 2), is(false));
  }

  @Test
  void sum7True() {
    Integer[] array = {5, 3, 1, 6, 2, 2};
    assertThat(sumOfTwoNumbersInArray.findNumbers(array, 7), is(true));
  }

  @Test
  void sum1EmptyArray() {
    Integer[] array = {};
    assertThat(sumOfTwoNumbersInArray.findNumbers(array, 1), is(false));
  }

  @Test
  void sum1ArrayNull() {
    Integer[] array = null;
    assertThat(sumOfTwoNumbersInArray.findNumbers(array, 1), is(false));
  }

  @Test
  void findIndexes_0_1() {
    int[] array = {2, 7, 11, 15};
    int[] actualArray = sumOfTwoNumbersInArray.findIndexes(array, 9);
    int[] expectedArray = {0, 1};
    assertThat(actualArray, is(expectedArray));
  }

  @Test
  void findIndexes_1_3() {
    int[] array = {2, 7, 11, 15};
    int[] actualArray = sumOfTwoNumbersInArray.findIndexes(array, 22);
    int[] expectedArray = {1, 3};
    assertThat(actualArray, is(expectedArray));
  }

  @Test
  void findIndexes_null() {
    int[] array = {2, 7, 11, 15};
    int[] actualArray = sumOfTwoNumbersInArray.findIndexes(array, 1);
    int[] expectedArray = null;
    assertThat(actualArray, is(expectedArray));
  }
}
