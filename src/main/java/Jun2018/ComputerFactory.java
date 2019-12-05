package Jun2018;//public class Jun2018.ComputerFactory {
//  public static Jun2018.Computer getComputer(String type, String ram) {
//    if ("Jun2018.PC".equalsIgnoreCase(type)) {
//      return new Jun2018.PC(ram);
//    } else {
//      return null;
//    }
//  }
//}

public class ComputerFactory {
  public static Computer getComputer(String type, String ram) {
    if ("Jun2018.PC".equalsIgnoreCase(type)) {
      return new PC(ram);
    } else {
      return null;
    }
  }
}