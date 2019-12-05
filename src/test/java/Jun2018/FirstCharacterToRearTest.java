package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstCharacterToRearTest {
  private FirstCharacterToRear firstCharacterToRear = new FirstCharacterToRear();

  @Test
  public void moveFirstCharacter() {
    String result = firstCharacterToRear.move("A");

    assertEquals("A", result);
  }

  @Test
  public void moveFirstCharacterOfTwo() {
    String result = firstCharacterToRear.move("AB");

    assertEquals("BA", result);
  }

  @Test
  public void moveFirstCharacterOfThree() {
    String result = firstCharacterToRear.move("XYZ");

    assertEquals("YZX", result);
  }
}
