package Jun2018;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrintArrayRowTest {

  private PrintArrayRow printArrayRow = new PrintArrayRow();

  @Disabled
  @Test
  public void oneRow() {
    int[][] array = {{1,3,5}};
    int[][] result = printArrayRow.print(array);
    int[][] expected = {{1},{3},{5}};

    assertTrue(Arrays.equals(expected, result));
  }
}
