package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class IntegerPalindromeTest {
  private IntegerPalindrome integerPalindrome;

  @BeforeEach
  void setUp() {
    integerPalindrome = new IntegerPalindrome();
  }

  @Test
  void integerPalindrome10False() {
    boolean result = integerPalindrome.isPalindrome(10);
    assertThat(result, is(false));
  }

  @Test
  void integerPalindrome11True() {
    boolean result = integerPalindrome.isPalindrome(11);
    assertThat(result, is(true));
  }

  @Test
  void integerPalindrome128False() {
    boolean result = integerPalindrome.isPalindrome(128);
    assertThat(result, is(false));
  }

  @Test
  void integerPalindrome252True() {
    boolean result = integerPalindrome.isPalindrome(252);
    assertThat(result, is(true));
  }

  @Test
  void integerPalindrome5678False() {
    boolean result = integerPalindrome.isPalindrome(5678);
    assertThat(result, is(false));
  }

  @Test
  void integerPalindrome33333True() {
    boolean result = integerPalindrome.isPalindrome(3333);
    assertThat(result, is(true));
  }

  @Test
  void integerPalindrome0True() {
    boolean result = integerPalindrome.isPalindrome(0);
    assertThat(result, is(true));
  }

  @Test
  void integerPalindrome100True() {
    boolean result = integerPalindrome.isPalindrome(100);
    assertThat(result, is(false));
  }
}
