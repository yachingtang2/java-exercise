package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StackTest {
  private Stack stack;

  @BeforeEach
  void setUp() {
    stack = new Stack();
  }

  @Test
  void emptyStack() {
    assertThat(stack.peep(), nullValue());
    assertThat(stack.isEmpty(), is(true));
    assertThrows(StackEmptyException.class, () -> stack.pop());
  }

  @Test
  void insert1Element() throws StackEmptyException {
    stack.push(1);

    assertThat(stack.pop(), is(1));
    assertThat(stack.isEmpty(), is(true));
  }

  @Test
  void insert2ElementsPop2() throws StackEmptyException {
    stack.push(7);
    stack.push(8);

    assertThat(stack.pop(), is(8));
    assertThat(stack.isEmpty(), is(false));
    assertThat(stack.size(), is(1));
    assertThat(stack.pop(), is(7));
    assertThat(stack.isEmpty(), is(true));
  }

  @Test
  void insert3ElementsPop2() throws StackEmptyException {
    stack.push(3);
    stack.push(2);
    stack.push(1);

    assertThat(stack.peep(), is(1));
    assertThat(stack.pop(), is(1));
    assertThat(stack.isEmpty(), is(false));
    assertThat(stack.size(), is(2));
    assertThat(stack.peep(), is(2));
    assertThat(stack.pop(), is(2));
    assertThat(stack.isEmpty(), is(false));
    assertThat(stack.size(), is(1));
    assertThat(stack.peep(), is(3));
    assertThat(stack.pop(), is(3));
    assertThat(stack.isEmpty(), is(true));
  }
}
