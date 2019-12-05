package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringRecursiveReversalTest {
  private StringRecursiveReversal reversal = new StringRecursiveReversal();

  @Test
  public void reverseOneCharacter() {
    String reversedString = reversal.reverseString("1");

    assertEquals("1", reversedString);
  }

  @Test
  public void reverseTwoCharacters() {
    String reversedString = reversal.reverseString("12");

    assertEquals("21", reversedString);
  }

  @Test
  public void reverseHasSpace() {
    String reversedString = reversal.reverseString("1 2");

    assertEquals("2 1", reversedString);
  }

  @Test
  public void reverseLongString() {
    String reversedString = reversal.reverseString("bye bye sabre");

    assertEquals(new StringBuilder("bye bye sabre").reverse().toString(), reversedString);
  }
}
