package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
  private Factorial factorial = new Factorial();

  @Test
  void factorial_zero() {
    int result = factorial.compute(0);

    assertEquals(0, result);
  }
//
//  @Test
//  void factorial_one() {
//    int result = factorial.compute(1);
//
//    assertEquals(1, result);
//  }
//
//  @Test
//  void factorial_two() {
//    int result = factorial.compute(2);
//
//    assertEquals(2, result);
//  }
//
//  @Test
//  void factorial_three() {
//    int result = factorial.compute(3);
//
//    assertEquals(6, result);
//  }
//
//  @Test
//  void factorial_four() {
//    int result = factorial.compute(4);
//
//    assertEquals(24, result);
//  }
//
//  @Test
//  void factorial_five() {
//    int result = factorial.compute(5);
//
//    assertEquals(120, result);
//  }
}