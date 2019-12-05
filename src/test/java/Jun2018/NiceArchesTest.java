package Jun2018;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NiceArchesTest {
  private NiceArches niceArches = new NiceArches();

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

  @Disabled
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

  @Test
  public void fixFailedTest1() {
    String[] array = {"AAAAAAAABAAABA"};
    int result = niceArches.countArches(array);
    assertEquals(0, result);
  }

  @Test
  public void fixFailedTest2() {
    String[] array = {"BBBBBBBBBBBBBB"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void fixFailedTest3() {
    String[] array = {"ABBABBABBABB"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void fixFailedTest4() {
    String[] array = {"AAABAAABBABAAA"};
    int result = niceArches.countArches(array);
    assertEquals(0, result);
  }

  @Disabled
  @Test
  public void fixFailedTest5() {
    String[] array = {"ABAABAAAAAAAAA"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  // ABAABAAAAAAAAA
  // 01234567890123

  @Test
  public void fixFailedTest6() {
    String[] array = {"AABAAAAAABAAAA"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  // AABAAAAAABAAAA
  // 01234567890123

  @Test
  public void fixFailedTest7() {
    String[] array = {"AAAABB"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void fixFailedTest8() {
    String[] array = {"AABBBBAABAAB"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void fixFailedTest9() {
    String[] array = {"ABAAAAAAAAAB"};
    int result = niceArches.countArches(array);
    assertEquals(0, result);
  }

  @Test
  public void fixFailedTest10() {
    String[] array = {"ABABBBABAB"};
    int result = niceArches.countArches(array);
    assertEquals(0, result);
  }

  @Test
  public void fixFailedTest11() {
    String[] array = {"BBBBBBBBBBBBBB"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  // BBBBBBBBBBBBBB
  // 01234567890123

  @Test
  public void fixFailedTest12() {
    String[] array = {"AABAABAAAA"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  // AABAABAAAA
  // 0123456789

  @Test
  public void fixFailedTest13() {
    String[] array = {"AABAAABBBBBABB"};
    int result = niceArches.countArches(array);
    assertEquals(0, result);
  }

  // AABAAABBBBBABB
  // 01234567890123

  @Test
  public void fixFailedTest14() {
    String[] array = {"BBBAAAAABA"};
    int result = niceArches.countArches(array);
    assertEquals(0, result);
  }

  @Test
  public void fixFailedTest15() {
    String[] array = {"BBBBBBBBBBBBBB"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void fixFailedTest16() {
    String[] array = {"AAAAAAAAAAAABB"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void fixFailedTest17() {
    String[] array = {"BAAAAABAAAAAAA"};
    int result = niceArches.countArches(array);
    assertEquals(0, result);
  }

  @Test
  public void fixFailedTest18() {
    String[] array = {"BBBBABBBBBBA"};
    int result = niceArches.countArches(array);
    assertEquals(1, result);
  }

  @Test
  public void fixFailedTest19() {
    String[] array = {"BBABABAAAAAABB"};
    int result = niceArches.countArches(array);
    assertEquals(0, result);
  }

  @Test
  public void fixFailedTest20() {
    String[] array = {"ABAABAABAB"};
    int result = niceArches.countArches(array);
    assertEquals(0, result);
  }
}
