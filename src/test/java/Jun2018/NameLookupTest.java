package Jun2018;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class NameLookupTest {

  private NameLookup nameLookup = new NameLookup();

  @Test
  public void firstName() {
    int[] queryNumber = {1,2};
    String[] rollsAndNames = { "1 john", "2 joe", "3 jason", "4 jerry", "5 joan" };
    nameLookup.add(rollsAndNames);

    Assertions.assertEquals("john", nameLookup.lookup(queryNumber[0]));
  }

  @Test
  public void secondName() {
    int[] queryNumber = {1,2};
    String[] rollsAndNames = { "1 john", "2 joe", "3 jason", "4 jerry", "5 joan" };
    nameLookup.add(rollsAndNames);

    Assertions.assertEquals("joe", nameLookup.lookup(queryNumber[1]));
  }

  @Test
  public void noName() {
    int[] queryNumber = {6};
    String[] rollsAndNames = { "1 john", "2 joe", "3 jason", "4 jerry", "5 joan", "6" };
    nameLookup.add(rollsAndNames);

    assertNull(nameLookup.lookup(queryNumber[0]));
  }
}
