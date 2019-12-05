package Jun2018;

public class BillPughSingleton {
  private static BillPughSingleton instance;

  private BillPughSingleton() {}

  public static BillPughSingleton getInstance() {
    if(instance == null) {
      synchronized (BillPughSingleton.class) {
        if(instance == null) {
          instance = new BillPughSingleton();
        }
      }
    }
    return instance;
  }

//  private static class BillPughSingletonHelper {
//    private static Jun2018.BillPughSingleton instance = new Jun2018.BillPughSingleton();
//  }

}
