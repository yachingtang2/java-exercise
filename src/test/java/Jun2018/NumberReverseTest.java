package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberReverseTest {
  private NumberReverse numberReverse = new NumberReverse();

  @Test
  void reverse_1_digit() {
    int result = numberReverse.reverse(1);

    assertEquals(1, result);
  }

  @Test
  void reverse_2_digits() {
    int result = numberReverse.reverse(12);

    assertEquals(21, result);
  }

  @Test
  void reverse_3_digits() {
    int result = numberReverse.reverse(123);

    assertEquals(321, result);
  }

  @Test
  void reverse_4_digits_1230() {
    int result = numberReverse.reverse(1230);

    assertEquals(321, result);
  }

  @Test
  void reverse_4_digits_1235() {
    int result = numberReverse.reverse(1235);

    assertEquals(5321, result);
  }
}
