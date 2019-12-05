package Jun2018;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParenthesesStackTest {
  private ParenthesesStack parenthesesStack = new ParenthesesStack();

  @Test
  void parentheses_open_bracket() {
    Assertions.assertFalse(parenthesesStack.isBalanced("["));
  }

  @Test
  void parentheses_open_close_bracket() {
    Assertions.assertTrue(parenthesesStack.isBalanced("[]"));
  }

  @Test
  void parentheses_one() {
    Assertions.assertFalse(parenthesesStack.isBalanced("[(])"));
  }

  @Test
  void parentheses_two() {
    Assertions.assertTrue(parenthesesStack.isBalanced("[()]{}{[()()]()}"));
  }
}
