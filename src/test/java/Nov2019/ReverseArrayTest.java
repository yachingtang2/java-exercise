package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ReverseArrayTest {
  private ReverseArray reverseArray;

  @BeforeEach
  void setUp() {
    reverseArray = new ReverseArray();
  }

  @Test
  void oneElement() {
    String[] array = {"abc"};
    String[] reversedArray = reverseArray.reverse(array);
    assertThat(reversedArray, is(array));
  }

  @Test
  void twoElements() {
    String[] array = {"hi", "you"};
    String[] reversedArray = reverseArray.reverse(array);
    String[] expectedArray = {"you", "hi"};
    assertThat(reversedArray, is(expectedArray));
  }

  @Test
  void threeElements() {
    String[] array = {"one", "hi", "you"};
    String[] reversedArray = reverseArray.reverse(array);
    String[] expectedArray = {"you", "hi", "one"};
    assertThat(reversedArray, is(expectedArray));
  }

  @Test
  void fourElements() {
    String[] array = {"from", "paris", "from", "love"};
    String[] reversedArray = reverseArray.reverse(array);
    String[] expectedArray = {"love", "from", "paris", "from"};
    assertThat(reversedArray, is(expectedArray));
  }
}
