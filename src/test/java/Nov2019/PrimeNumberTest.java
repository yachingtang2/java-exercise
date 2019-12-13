package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PrimeNumberTest {
  private PrimeNumber primeNumber;

  @BeforeEach
  void setUp() {
    primeNumber = new PrimeNumber();
  }

  @Test
  void generatePrimeNumbers() {
    List<Integer> primeNumbers = primeNumber.generate();
    assertThat(primeNumbers, contains(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97));
  }

  @Test
  void isPrimeNumber1False() {
    assertThat(primeNumber.isPrime(1), is(false));
  }

  @Test
  void isPrimeNumber2True() {
    assertThat(primeNumber.isPrime(2), is(true));
  }

  @Test
  void isPrimeNumber3True() {
    assertThat(primeNumber.isPrime(3), is(true));
  }

  @Test
  void isPrimeNumber4False() {
    assertThat(primeNumber.isPrime(4), is(false));
  }

  @Test
  void isPrimeNumber90False() {
    assertThat(primeNumber.isPrime(90), is(false));
  }

  @Test
  void isPrimeNumber97True() {
    assertThat(primeNumber.isPrime(97), is(true));
  }
}
