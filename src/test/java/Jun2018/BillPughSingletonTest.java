package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BillPughSingletonTest {
  @Test
  public void getInstance() {
    BillPughSingleton singleton = BillPughSingleton.getInstance();
    assertNotNull(singleton);
  }
}
