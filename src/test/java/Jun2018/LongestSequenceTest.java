package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSequenceTest {
  private LongestSequence longestSequence = new LongestSequence();

  @Test
  void find_a() {
    char result = longestSequence.find("a");

    assertEquals('a', result);
  }

  @Test
  void find_ab() {
    char result = longestSequence.find("ab");

    assertEquals('a', result);
  }

  @Test
  void find_aa() {
    char result = longestSequence.find("aa");

    assertEquals('a', result);
  }

  @Test
  void find_abb() {
    char result = longestSequence.find("abb");

    assertEquals('b', result);
  }

  @Test
  void find_abba() {
    char result = longestSequence.find("abba");

    assertEquals('a', result);
  }

  @Test
  void find_acbcbac() {
    char result = longestSequence.find("acbcbac");

    assertEquals('c', result);
  }
}
