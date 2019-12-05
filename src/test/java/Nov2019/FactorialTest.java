package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FactorialTest {
  private Factorial factorial;

  @BeforeEach
  void setUp() {
    factorial = new Factorial();
  }

  @Test
  void factorial1() {
    assertThat(factorial.generate(1), is(1));
  }

  @Test
  void factorial2() {
    assertThat(factorial.generate(2), is(2));
  }

  @Test
  void factorial3() {
    assertThat(factorial.generate(3), is(6));
  }

  @Test
  void factorial4() {
    assertThat(factorial.generate(4), is(24));
  }

  @Test
  void factorial5() {
    assertThat(factorial.generate(5), is(120));
  }
}
