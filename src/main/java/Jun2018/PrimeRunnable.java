package Jun2018;

public class PrimeRunnable implements Runnable {
  private long minPrime;

  public PrimeRunnable(long minPrime) {
    this.minPrime = minPrime;
  }

  public void run() {}

  public static void main(String[] args) {
    PrimeRunnable primeRunnable = new PrimeRunnable(123);
    new Thread(primeRunnable).start();
  }
}
