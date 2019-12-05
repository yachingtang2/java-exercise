package Jun2018;

public class PrimeNumber {
  public boolean isPrime(int number) {
    for(int i = 2; i < number; i++) {
      if((number % i == 0)) {
        return false;   // 3%1 = 0, 3%2= 1,  4%1 = 0, 4%2= 0
      }
    }
    return true;
  }
}
