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

}
