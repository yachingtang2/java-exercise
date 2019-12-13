package Nov2019;

import java.util.ArrayList;
import java.util.List;

class PrimeNumber {
  List<Integer> generate() {
    List<Integer> primes = new ArrayList<>();

    for(int i = 2; i <= 100; i++) {
      boolean isPrime = true;
      for(int j = 2; j < i; j++) {
        if(j < i && i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        primes.add(i);
      }
    }

    return primes;

//    List<Integer> primeNumbers = new ArrayList<>();
//
//    for(int i = 2; i < 100; i++) {
//      for(int j = 2; j <= i; j++) {
//        if (i % j == 0 && i > j && j != 1) {
//          break;
//        } else if(i % j == 0 && j == i) {
//          primeNumbers.add(i);
//        }
//      }
//    }
//    return primeNumbers;
  }

  boolean isPrime(int number) {

    if(number < 2) {
      return false;
    }
    boolean isPrimeNumber = true;

    for(int i = 2; i < number; i++) {
      if(number % i == 0) {
        isPrimeNumber = false;
        break;
      }
    }
    return isPrimeNumber;
  }
}
