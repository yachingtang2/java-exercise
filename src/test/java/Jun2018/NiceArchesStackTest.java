package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NiceArchesStackTest {
  private NiceArchesStack niceArches = new NiceArchesStack();

  @Test
  public void AAA_AA_AB() {
    String[] array = {"AAA", "AA", "AB"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void notAnArch() {
    String[] array = {"ABAB"};
    int result = niceArches.countArches(array);
    assertEquals(0, result);
  }

  @Test
  public void anArchSizeAABB() {
    String[] array = {"AABB"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void anArchSizeABBA() {
    String[] array = {"ABBA"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void oneArchSize8() {
    String[] array = {"ABBAAABB", "ABABAABB"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void twoArchesSize8() {
    String[] array = {"ABBAAABB", "ABBBBBBA"};
    int result = niceArches.countArches(array);
    assertEquals(2, result);
  }

  @Test
  public void twoArchesSize12() {
    String[] array = {"AAAABBBBBABA", "BBBBBBAAAAAA", "AABBAABBBBAA"};
    int result = niceArches.countArches(array);
    assertEquals(2, result);
  }

  @Test
  public void oneArchesSize16() {
    String[] array = {"AAAABBBBBABAAABB", "BBBBBABAAAAABBAA", "BBBBBBBBAAAAAAAA"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void manyAraches() {
    String[] array = {"AAAAAAAABAAABA", "BBBBBBBBBBBBBB", "ABBABBABBABB", "AAABAAABBABAAA",
        "ABAABAAAAAAAAA", "AABAAAAAABAAAA", "AAAABB", "AABBBBAABAAB",
        "ABAAAAAAAAAB", "ABABBBABAB", "BBBBBBBBBBBBBB", "AABAABAAAA",
        "AABAAABBBBBABB", "BBBAAAAABA", "BBBBBBBBBBBBBB", "AAAAAAAAAAAABB",
        "BAAAAABAAAAAAA", "BBBBABBBBBBA", "BBABABAAAAAABB", "ABAABAABAB"
    };
    int result = niceArches.countArches(array);
    assertEquals(12, result);
  }

}
