package Nov2019;

import java.util.ArrayList;
import java.util.List;

class PrimeNumber {
  List<Integer> generate() {
    List<Integer> primeNumbers = new ArrayList<>();

    for(int i = 2; i < 100; i++) {
      for(int j = 2; j <= i; j++) {
        if (i % j == 0 && i > j && j != 1) {
          break;
        } else if(i % j == 0 && j == i) {
          primeNumbers.add(i);
        }
      }
    }
    return primeNumbers;
  }
}
