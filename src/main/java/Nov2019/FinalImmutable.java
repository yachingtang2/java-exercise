package Nov2019;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class FinalImmutable implements Serializable {
  String modifyString() {
    final String string1 = "String 1";
//    string1 = "string 2";
//    string1 = string1.concat(" - hi");

    String string2 = "string 2";
    System.out.println("string2 - string 2 - " + string2.hashCode());
    string2 = "string 22";
    System.out.println("string2 - string 22 - " + string2.hashCode());

    System.out.println("YCT - string2 = " + string2);

    String s="Sachin";
    s.concat(" Tendulkar");//concat() method appends the string at the end
    System.out.println(s);//will print Sachin because strings are immutable objects

    String s1 = "tang";
    s1 = s1.concat("ya-ching");
    System.out.println(s1);

    String s2 = "Tang";
    s2 = "Ya-Ching";
    System.out.println(s2);

    String s3 = "AA";
    s3 = "aa";

    final List<Integer> integerList = new ArrayList<>();
    integerList.add(123);
    integerList.add(321);
//    integerList = List.of(1,2,3);

    final int value = 123;
//    value = 125;

    List<Integer> intList = List.of(1,2,3);
//    intList = new ArrayList<>();
//    intList.add(10);

    System.out.println("Integer List = " + integerList.toString());
    System.out.println("Int List = " + intList.toString());

//    try {
//      File file = new File("abc.txt");
//      InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
//    } finally {
//      throw new Exception();
//    }
    return string1;
  }

  public static String foo(){
    System.out.println("Test foo called");
    return "";
  }

  public static void main(String args[]){
    FinalImmutable obj = null;
    System.out.println(obj.foo());
  }

//  public static String toString(){
//    System.out.println("Test toString called");
//    return "";
//  }
//
//  public static void main(String args[]){
//    System.out.println(toString());
//  }

  final int modifyInteger() {
    return 0;
  }
}

class SubFinalImmutable extends FinalImmutable {
  private final int myValue;

  SubFinalImmutable(final int myValue) {
    this.myValue = myValue;
  }

  int getMyValue() {
    return this.myValue;
  }
//  int modifyInteger() {
//    return 1;
//  }
}

class Demo {
  void finalTest() {
    SubFinalImmutable subFinalImmutable = new SubFinalImmutable(5);
    int value = subFinalImmutable.getMyValue();
    value = 15;
    System.out.println("YCT - value = " + value);
  }
}
