package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {
  private Palindrome palindrome = new Palindrome();

  @Test
  void palindrome_ab_false() {
    boolean result = palindrome.isPalindrome("ab");

    assertFalse(result);
  }

  @Test
  void palindrome_aa_false() {
    boolean result = palindrome.isPalindrome("aa");

    assertTrue(result);
  }

  @Test
  void palindrome_aba_true() {
    boolean result = palindrome.isPalindrome("aba");

    assertTrue(result);
  }

  @Test
  void palindrome_abaa_false() {
    boolean result = palindrome.isPalindrome("abaa");

    assertFalse(result);
  }

  @Test
  void palindrome_abba_false() {
    boolean result = palindrome.isPalindrome("abba");

    assertTrue(result);
  }

  @Test
  void palindrome_My_Gym_false() {
    boolean result = palindrome.isPalindrome("My Gym");

    assertTrue(result);
  }

  @Test
  void palindrome_Dont_nod_true() {
    boolean result = palindrome.isPalindrome("Don't nod");

    assertTrue(result);
  }

  @Test
  void palindrome_Eva_true() {
    boolean result = palindrome.isPalindrome("Eva, can I see bees in a cave?");

    assertTrue(result);
  }
}
