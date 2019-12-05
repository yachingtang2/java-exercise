package Jun2018;//public class Jun2018.Singleton {
//  private static Jun2018.Singleton instance;
//
//  private Jun2018.Singleton() {}
//
//  public static Jun2018.Singleton getInstance() {
//    if (instance == null) {
//      synchronized (Jun2018.Singleton.class) {
//        instance = new Jun2018.Singleton();
//      }
//    }
//    return instance;
//  }
//}

//public class Jun2018.Singleton {
//  private static Jun2018.Singleton instance;
//
//  private Jun2018.Singleton() {}
//
//  public static Jun2018.Singleton getInstance() {
//    if(instance == null) {
//      synchronized (Jun2018.Singleton.class) {
//        instance = new Jun2018.Singleton();
//      }
//    }
//    return instance;
//  }
//}

public class Singleton {
  private Singleton() {
    System.out.println("In Constructor...");
  }

  private static class SingletonHelper {
    private static final Singleton INSTANCE = new Singleton();
  }

  public static Singleton getInstance() {
    System.out.println("instance = " + SingletonHelper.INSTANCE);
    return SingletonHelper.INSTANCE;
  }

  // 0000 0000 0000 1000
  // 0010 0010 0010 0010
  // 0 1 10 11 100 101 110 111 1000 1001 1010 1011 1100 1101 1110 1111 0001 0000
}


//  private Jun2018.Singleton() {}
//
//  private static class Helper {
//    private static Jun2018.Singleton instance = new Jun2018.Singleton();
//  }
//
//  public static Jun2018.Singleton getInstance() {
//    return Helper.instance;
//  }
//}
//public class Jun2018.Singleton {
//  private Jun2018.Singleton() {}
//
//  private static class Helper {
//    private static final Jun2018.Singleton instance = new Jun2018.Singleton();
//  }
//
//  public static Jun2018.Singleton getInstance() {
//    return Helper.instance;
//  }
//}

//public class Jun2018.Singleton {
//  private static Jun2018.Singleton instance;
//
//  private Jun2018.Singleton() {}
//
//  public static Jun2018.Singleton getInstance() {
//    if (instance == null) {
//      synchronized (Jun2018.Singleton.class) {
//        instance = new Jun2018.Singleton();
//      }
//    }
//    return instance;
//  }
//}