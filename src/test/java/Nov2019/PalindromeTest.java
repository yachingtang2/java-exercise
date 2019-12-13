package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PalindromeTest {
  private Palindrome palindrome;

  @BeforeEach
  void setUp() {
    palindrome = new Palindrome();
  }

  @Test
  void palindromeNullFalse() {
    boolean result = palindrome.isPalindrome(null);
    assertThat(result, is(false));
  }

  @Test
  void palindromeAFalse() {
    boolean result = palindrome.isPalindrome("A");
    assertThat(result, is(false));
  }

  @Test
  void palindromeHiFalse() {
    boolean result = palindrome.isPalindrome("Hi");
    assertThat(result, is(false));
  }

  @Test
  void palindromeBobTrue() {
    boolean result = palindrome.isPalindrome("Bob");
    assertThat(result, is(true));
  }

  @Test
  void palindromeSentenceTrue() {
    boolean result = palindrome.isPalindrome("Murder for a jar of red rum");
    assertThat(result, is(true));
  }

  @Test
  void palindromeSentenceWithSymbolsTrue() {
    boolean result = palindrome.isPalindrome("Murder, for a jar of red rum!");
    assertThat(result, is(true));
  }
}
