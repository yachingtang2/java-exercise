package Jun2018;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeComplexityTest {

  private TimeComplexity timeComplexity = new TimeComplexity();

  @Test
  public void case1() {
    int result = timeComplexity.count(5);

    assertEquals(10, result);
  }

  @Disabled
  @Test
  public void case2() {
    int result = timeComplexity.count2(4);

    assertEquals(5, result);
  }
}
