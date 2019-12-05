package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {
  private ReverseString reverseString = new ReverseString();

  @Test
  void reverseString_length_one() {
    String string = "a";
    String reversedString = reverseString.reverse(string);

    assertEquals(string, reversedString);
  }

  @Test
  void reverseString_length_two() {
    String string = "aa";
    String reversedString = reverseString.reverse(string);

    assertEquals(string, reversedString);
  }

  @Test
  void reverseString_length_three() {
    String string = "aba";
    String reversedString = reverseString.reverse(string);

    assertEquals(string, reversedString);
  }

  @Test
  void reverseString_length_four() {
    String string = "abcd";
    String reversedString = reverseString.reverse(string);

    assertEquals(new StringBuilder(string).reverse().toString(), reversedString);
  }

  @Test
  void reverseString_length_five() {
    String string = "abcdb";
    String reversedString = reverseString.reverse(string);

    assertEquals(new StringBuilder(string).reverse().toString(), reversedString);
  }
}
