package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToggleStringTest {

  private ToggleString togglString = new ToggleString();

  @Test
  public void singleLetter() {
    String result = togglString.toggle("a");

    assertEquals("A", result);
  }

  @Test
  public void twoLetters() {
    String result = togglString.toggle("aA");

    assertEquals("Aa", result);
  }

  @Test
  public void threeLetters() {
    String result = togglString.toggle("bbb");

    assertEquals("BBB", result);
  }


  @Test
  public void fourLetters() {
    String result = togglString.toggle("CCCC");

    assertEquals("cccc", result);
  }
}
