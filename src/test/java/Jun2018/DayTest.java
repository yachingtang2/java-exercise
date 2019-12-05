package Jun2018;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTest {

  @Test
  public void monday() {
    Assertions.assertEquals("MONDAY", Day.MONDAY.toString());
  }

  @Test
  public void tuesday() {
    Assertions.assertEquals("Tuesday", Day.TUESDAY.day());
  }
}
