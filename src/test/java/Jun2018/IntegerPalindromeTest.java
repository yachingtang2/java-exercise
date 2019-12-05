package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerPalindromeTest {
  private IntegerPalindrome integerPalindrome = new IntegerPalindrome();

  @Test
  void isPalindrome_12_false() {
    boolean result = integerPalindrome.isPalindrome(12);

    assertFalse(result);
  }

  @Test
  void isPalindrome_111_true() {
    boolean result = integerPalindrome.isPalindrome(111);

    assertTrue(result);
  }

  @Test
  void isPalindrome_1234_true() {
    boolean result = integerPalindrome.isPalindrome(1234);

    assertFalse(result);
  }
}
