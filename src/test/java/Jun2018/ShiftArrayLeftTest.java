package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShiftArrayLeftTest {
  private ShiftArrayLeft shiftArrayLeft = new ShiftArrayLeft();

  @Test
  void shiftLeft_one() {
    int[] array = {10,20,30,40,50};
    int[] expectedArray = {20,30,40,50,10};

    int[] shiftedArray = shiftArrayLeft.shift(array, 1);

    assertArrayEquals(expectedArray, shiftedArray);
  }

  @Test
  void shiftLeft_two() {
    int[] array = {10,20,30,40,50};
    int[] expectedArray = {30,40,50,10,20};

    int[] shiftedArray = shiftArrayLeft.shift(array, 2);

    assertArrayEquals(expectedArray, shiftedArray);
  }

  @Test
  void shiftLeft_three() {
    int[] array = {10,20,30,40,50};
    int[] expectedArray = {40,50,10,20,30};

    int[] shiftedArray = shiftArrayLeft.shift(array, 3);

    assertArrayEquals(expectedArray, shiftedArray);
  }

  @Test
  void shiftLeft_four() {
    int[] array = {10,20,30,40,50};
    int[] expectedArray = {50,10,20,30,40};

    int[] shiftedArray = shiftArrayLeft.shift(array, 4);

    assertArrayEquals(expectedArray, shiftedArray);
  }

  @Test
  void shiftLeft_five() {
    int[] array = {10,20,30,40,50};
    int[] expectedArray = {10,20,30,40,50};

    int[] shiftedArray = shiftArrayLeft.shift(array, 5);

    assertArrayEquals(expectedArray, shiftedArray);
  }

  @Test
  void shiftLeft_six() {
    int[] array = {10,20,30,40,50};
    int[] expectedArray = {20,30,40,50,10};

    int[] shiftedArray = shiftArrayLeft.shift(array, 6);

    assertArrayEquals(expectedArray, shiftedArray);
  }

  @Test
  void shiftLeft_fourteen() {
    int[] array = {10,20,30,40,50};
    int[] expectedArray = {50,10,20,30,40};

    int[] shiftedArray = shiftArrayLeft.shift(array, 14);

    assertArrayEquals(expectedArray, shiftedArray);
  }
}
