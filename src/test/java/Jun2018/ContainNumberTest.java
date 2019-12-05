package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainNumberTest {
  private ContainNumber containNumber = new ContainNumber();

  @Test
  public void contain_1_true() {
    boolean result = containNumber.contain(1);

    assertTrue(result);
  }

  @Test
  public void contain_0_true() {
    boolean result = containNumber.contain(0);

    assertTrue(result);
  }

  @Test
  public void contain_2_true() {
    boolean result = containNumber.contain(2);

    assertTrue(result);
  }

  @Test
  public void contain_3_true() {
    boolean result = containNumber.contain(3);

    assertTrue(result);
  }
}
