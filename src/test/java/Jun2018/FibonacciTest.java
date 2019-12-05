package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
  private Fibonacci fibonacci = new Fibonacci();  // 1,1,2,3,5,8,13

  @Test
  void compute_first_number() {
    int result = fibonacci.compute(1);

    assertEquals(1, result);
  }

  @Test
  void compute_second_number() {
    int result = fibonacci.compute(2);

    assertEquals(2, result);
  }

  @Test
  void compute_third_number() {
    int result = fibonacci.compute(3);

    assertEquals(3, result);
  }

  @Test
  void compute_fourth_number() {
    int result = fibonacci.compute(4);

    assertEquals(5, result);
  }

  @Test
  void compute_fifth_number() {
    int result = fibonacci.compute(5);

    assertEquals(8, result);  // 1,2,3,5,8
  }

  @Test
  void compute_sixth_number() {
    int result = fibonacci.compute(6);

    assertEquals(13, result);
  }
}

