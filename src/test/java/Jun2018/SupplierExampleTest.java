package Jun2018;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

class SupplierExampleTest {

  private Supplier<Double> randomNumber = Math::random;

  @Test
  void getRandomNumber() {
    System.out.println(randomNumber.get());
  }

  @Test
  void getString() {
    Supplier<String> helloString = () -> "Hello";

    System.out.println(helloString.get() + ", you!");
  }
}
