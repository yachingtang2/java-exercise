package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubstringSortingTest {

  private SubstringSorting sorting = new SubstringSorting();

  @Test
  public void sortNothing() {
    String result = sorting.sortSubString("hlleo", 1, 3);

    assertEquals("hlleo", result);
  }

  @Test
  public void sortOoneefspd() {
    String result = sorting.sortSubString("ooneefspd", 0, 8);

    assertEquals("spoonfeed", result);
  }

  @Test
  public void sortEffort() {
    String result = sorting.sortSubString("effort", 1, 4);

    assertEquals("erofft", result);
  }
}
