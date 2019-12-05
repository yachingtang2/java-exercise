package Jun2018;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestUniformSubstringTest {

  private LongestUniformSubstring longestUniformSubstring = new LongestUniformSubstring();

  @Test
  public void emptyString() {
    String string = "";

    int[] expected = {-1, 0};
    int[] actual = longestUniformSubstring.search(string);

    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void oneCharString() {
    String string = "a";

    int[] expected = {0, 1};
    int[] actual = longestUniformSubstring.search(string);

    System.out.println(expected.toString());
    System.out.println(actual.toString());

    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void twoIdenticalCharactersString() {
    String string = "aa";

    int[] expected = {0, 2};
    int[] actual = longestUniformSubstring.search(string);

    System.out.println(expected.toString());
    System.out.println(actual.toString());

    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void twoDifferentCharactersString() {
    String string = "ab";

    int[] expected = {0, 1};
    int[] actual = longestUniformSubstring.search(string);

    System.out.println(expected.toString());
    System.out.println(actual.toString());

    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void threeIdenticalCharactersString() {
    String string = "aaa";

    int[] expected = {0, 3};
    int[] actual = longestUniformSubstring.search(string);

    System.out.println(expected.toString());
    System.out.println(actual.toString());

    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void twoIdenticalOneDiffCharactersString() {
    String string = "aab";

    int[] expected = {0, 2};
    int[] actual = longestUniformSubstring.search(string);

    System.out.println(expected.toString());
    System.out.println(actual.toString());

    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void oneDiffTwoIdenticalCharactersString() {
    String string = "abb";

    int[] expected = {1, 2};
    int[] actual = longestUniformSubstring.search(string);

    System.out.println(expected.toString());
    System.out.println(actual.toString());

    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void abaCharactersString() {
    String string = "aba";

    int[] expected = {0, 1};
    int[] actual = longestUniformSubstring.search(string);

    System.out.println(expected.toString());
    System.out.println(actual.toString());

    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void One0000111CharactersString() {
    String string = "10000111";

    int[] expected = {1, 4};
    int[] actual = longestUniformSubstring.search(string);

    System.out.println(expected.toString());
    System.out.println(actual.toString());

    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void aabbbbbCdAACharactersString() {
    String string = "aabbbbbCdAA";

    int[] expected = {2, 5};
    int[] actual = longestUniformSubstring.search(string);

    System.out.println(expected.toString());
    System.out.println(actual.toString());

    assertTrue(Arrays.equals(expected, actual));
  }
}
