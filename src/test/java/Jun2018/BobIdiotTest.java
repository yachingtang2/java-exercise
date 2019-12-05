package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BobIdiotTest {
  private BobIdiot bobIdiot = new BobIdiot();

  @Test
  public void oneSwap() {
    String[] swappedCharacters = {"W H"};
    String result = bobIdiot.swapBack("WelloHorld", swappedCharacters);

    assertEquals("HelloWorld", result);
  }

  @Test
  public void twoSwaps() {
    String[] swappedCharacters = {"W H", "e r"};
    String result = bobIdiot.swapBack("WelloHorld", swappedCharacters);

    assertEquals("HrlloWoeld", result);
  }

  @Test
  public void oneSwapWebI() {
    String[] swappedCharacters = {"W B"};
    String result = bobIdiot.swapBack("WebI", swappedCharacters);

    assertEquals("BeWI", result);
  }

  @Test
  public void twoSwapsWebI() {
    String[] swappedCharacters = {"W B", "B I"};
    String result = bobIdiot.swapBack("WebI", swappedCharacters);

    assertEquals("IeWB", result);
  }

  @Test
  public void threeSwapsWebI() {
    String[] swappedCharacters = {"W B", "B I", "I W"};
    String result = bobIdiot.swapBack("WebI", swappedCharacters);

    assertEquals("WeIB", result);

  }
}
