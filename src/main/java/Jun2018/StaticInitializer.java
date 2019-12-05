package Jun2018;

import java.util.HashMap;
import java.util.Map;

public class StaticInitializer {
  private static int a;
  static {
    a = 5;
    doSomething(a);
  }
  private static int doSomething(int x) {
    return (x+5);
  }

  public static void main(String[] args) {
    int result = doSomething(6);

    System.out.println("result = " + result);

    Map<String, Integer> map = new HashMap<>();

    map.put("1", 2);
    map.put("1", null);
    map.put(null, null);
    map.put(null, 3);

    System.out.println(map.get("1"));
    System.out.println(map.get(null));

    String str1= new String("ABCD");
    String str2= new String("ABCD");
//    String str1 = "test";
//    String str2 = str1;
    if(str1 == str2)
    {
      System.out.println("String 1 == String 2 is true");
    }
    else
    {
      System.out.println("String 1 == String 2 is false, " + str1.hashCode() + ", " + str2.hashCode());
      String str3 = str2;
      if( str2 == str3)
      {
        System.out.println("String 2 == String 3 is true, " + str2.hashCode() + ", " + str3.hashCode());
      }
      else
      {
        System.out.println("String 2 == String 3 is false");
      }
      if(str1.equals(str2))
      {
        System.out.println("String 1 equals string 2 is true");
      }
      else
      {
        System.out.println("String 1 equals string 2 is false");
      }
    }
  }
}