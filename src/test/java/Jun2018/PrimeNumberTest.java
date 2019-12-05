package Jun2018;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeNumberTest {
  private PrimeNumber primeNumber = new PrimeNumber();

  @Test
  void number_one_true() {
    Assertions.assertTrue(primeNumber.isPrime(1));
  }

  @Test
  void number_two_true() {
    Assertions.assertTrue(primeNumber.isPrime(2));
  }

  @Test
  void number_three_true() {
    Assertions.assertTrue(primeNumber.isPrime(3));
  }

  @Test
  void number_four_false() {
    Assertions.assertFalse(primeNumber.isPrime(4));
  }

  @Test
  void number_five_true() {
    Assertions.assertTrue(primeNumber.isPrime(5));
  }

  @Test
  void number_six_false() {
    Assertions.assertFalse(primeNumber.isPrime(6));
  }

  @Test
  void number_seven_true() {
    Assertions.assertTrue(primeNumber.isPrime(7));
  }

  @Test
  void number_eight_false() {
    Assertions.assertFalse(primeNumber.isPrime(8));
  }
}
