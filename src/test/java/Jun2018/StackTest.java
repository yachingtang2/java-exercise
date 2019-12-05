package Jun2018;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
  private Stack stack = new Stack();

  @Test
  public void isEmpty() {
    Assertions.assertTrue(stack.isEmpty());
  }

  @Test
  public void push_one() {
    stack.push(1);

    Assertions.assertFalse(stack.isEmpty());
  }

  @Test
  public void peep_one() {
    stack.push(1);
    Object result = stack.peep();

    assertEquals(1, result);
    Assertions.assertFalse(stack.isEmpty());
  }

  @Test
  public void pop_one() {
    stack.push(1);
    Object result = stack.pop();

    assertEquals(1, result);
    Assertions.assertTrue(stack.isEmpty());
    assertNull(stack.peep());
  }

  @Test
  public void push_one_two() {
    stack.push(1);
    stack.push(2);

    Assertions.assertFalse(stack.isEmpty());
    Assertions.assertEquals(2, stack.size());
    Assertions.assertEquals(2, stack.peep());
  }

  @Test
  public void pop_two() {
    stack.push(1);
    stack.push(2);
    Object value = stack.pop();

    Assertions.assertFalse(stack.isEmpty());
    Assertions.assertEquals(1, stack.size());
    assertEquals(2, value);
    Assertions.assertEquals(1, stack.peep());
  }

  @Test
  public void pop_null() {
    assertNull(stack.pop());
  }
}
