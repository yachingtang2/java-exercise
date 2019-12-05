package Jun2018;

public class PrimeThread extends Thread {
  long minPrime;

  public PrimeThread(long minPrime) {
    this.minPrime = minPrime;
  }

  public void run() {}

  public static void main(String[] args) {
    PrimeThread primeThread = new PrimeThread(143);

    primeThread.start();

    Thread thread = new Thread();
    thread.start();
  }
}
