package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubstringOccurrenceTest {
  private SubstringOccurrence substringOccurrence = new SubstringOccurrence();

  @Test
  public void findOneOccurrence() {
    int result = substringOccurrence.findSubString("sda", "sadasda");

    assertEquals(1, result);
  }

  @Test
  public void findTwoOccurrences() {
    int result = substringOccurrence.findSubString("sda", "sadasdasda");

    assertEquals(2, result);
  }

  @Test
  public void findThreeOccurrences() {
    int result = substringOccurrence.findSubString("a", "sadasda");

    assertEquals(3, result);
  }

  @Test
  public void findTwoDAOccurrences() {
    int result = substringOccurrence.findSubString("d", "sadasda");

    assertEquals(2, result);
  }

  @Test
  public void findZeroOccurrences() {
    int result = substringOccurrence.findSubString("sadasdaa", "sadasda");

    assertEquals(0, result);
  }
}
