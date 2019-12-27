package Nov2019;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ArrayRotationTest {

  private ArrayRotation arrayRotation = new ArrayRotation();
  private int[] array = {1,2,3};

  @Test
  void rotate0() {
    int[] expectedArray = {1,2,3};
    assertThat(arrayRotation.rotateLeft(array, 0), is(expectedArray));
  }

  @Test
  void rotate3() {
    int[] expectedArray = {1,2,3};
    assertThat(arrayRotation.rotateLeft(array, 3), is(expectedArray));
  }

  @Test
  void rotate1() {
    int[] expectedArray = {2,3,1};
    assertThat(arrayRotation.rotateLeft(array, 1), is(expectedArray));
  }

  @Test
  void rotate2() {
    int[] expectedArray = {3,1,2};
    assertThat(arrayRotation.rotateLeft(array, 2), is(expectedArray));
  }

  @Test
  void rotate3in5() {
    int[] array = {1,2,3,4,5};
    int[] expectedArray = {4,5,1,2,3};
    assertThat(arrayRotation.rotateLeft(array, 3), is(expectedArray));
  }

  @Test
  void rotate4in5() {
    int[] array = {1,2,3,4,5};
    int[] expectedArray = {5,1,2,3,4};
    assertThat(arrayRotation.rotateLeft(array, 4), is(expectedArray));
  }

  @Test
  void rotate5in5() {
    int[] array = {1,2,3,4,5};
    int[] expectedArray = {1,2,3,4,5};
    assertThat(arrayRotation.rotateLeft(array, 5), is(expectedArray));
  }

  @Test
  void rotateRight0() {
    int[] expectedArray = {1,2,3};
    assertThat(arrayRotation.rotateRight(array, 0), is(expectedArray));
  }

  @Test
  void rotateRight3() {
    int[] expectedArray = {1,2,3};
    assertThat(arrayRotation.rotateRight(array, 3), is(expectedArray));
  }

  @Test
  void rotateRight1() {
    int[] expectedArray = {3,1,2};
    assertThat(arrayRotation.rotateRight(array, 1), is(expectedArray));
  }

  @Test
  void rotateRight2() {
    int[] expectedArray = {2,3,1};
    assertThat(arrayRotation.rotateRight(array, 2), is(expectedArray));
  }

  @Test
  void rotateRight3in5() {
    int[] array = {1,2,3,4,5};
    int[] expectedArray = {3,4,5,1,2};
    assertThat(arrayRotation.rotateRight(array, 3), is(expectedArray));
  }

  @Test
  void rotateRight4in5() {
    int[] array = {1,2,3,4,5};
    int[] expectedArray = {2,3,4,5,1};
    assertThat(arrayRotation.rotateRight(array, 4), is(expectedArray));
  }

  @Test
  void rotateRight5in5() {
    int[] array = {1,2,3,4,5};
    int[] expectedArray = {1,2,3,4,5};
    assertThat(arrayRotation.rotateRight(array, 5), is(expectedArray));
  }
}
