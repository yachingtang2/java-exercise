package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FibonacciTest {
  private Fibonacci fibonacci;

  @BeforeEach
  void setUp() {
    fibonacci = new Fibonacci();
  }

  @Test
  void recursive1() {
    assertThat(fibonacci.generate(1), is(1));
  }

  @Test
  void recursive2() {
    assertThat(fibonacci.generate(2), is(2));
  }

  @Test
  void recursive3() {
    assertThat(fibonacci.generate(3), is(3));
  }

  @Test
  void recursive4() {
    assertThat(fibonacci.generate(4), is(5));
  }

  @Test
  void recursive5() {
    assertThat(fibonacci.generate(5), is(8));
  }

  @Test
  void recursive6() {
    assertThat(fibonacci.generate(6), is(13));
  }

  @Test
  void recursive7() {
    assertThat(fibonacci.generate(7), is(21));
  }

  @Test
  void isFibonacci1() {
    assertThat(fibonacci.isFibonacci(1), is(true));
  }

  @Test
  void isFibonacci2() {
    assertThat(fibonacci.isFibonacci(2), is(true));
  }

  @Test
  void isFibonacci3() {
    assertThat(fibonacci.isFibonacci(3), is(true));
  }

  @Test
  void isFibonacci5() {
    assertThat(fibonacci.isFibonacci(5), is(true));
  }

  @Test
  void isFibonacci8() {
    assertThat(fibonacci.isFibonacci(8), is(true));
  }

  @Test
  void isFibonacci13() {
    assertThat(fibonacci.isFibonacci(13), is(true));
  }

  @Test
  void isFibonacci4() {
    assertThat(fibonacci.isFibonacci(4), is(false));
  }

  @Test
  void isFibonacci1234893() {
    assertThat(fibonacci.isFibonacci(1234893), is(false));
  }
}
