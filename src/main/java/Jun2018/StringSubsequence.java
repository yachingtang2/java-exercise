package Jun2018;

import java.io.IOException;
import java.util.HashSet;

public class StringSubsequence {

  public static void main(String[] args) {

    String s1 = "abc";
    String s2 = "abc";
    String s22 = s2;
    System.out.println("s1 == s2 is:" + (s1 == s2));
    System.out.println("s22 == s2 is:" + (s22 == s2));

    String s3 = "JournalDev";
    int start = 1;
    char end = 5;
    System.out.println(start + end);
    System.out.println(s3.substring(start, end));

    HashSet shortSet = new HashSet();
    for (short i = 0; i < 100; i++) {
      shortSet.add(i);
      shortSet.remove(i - 1);
    }
    System.out.println(shortSet.size());
  }
//  public static void main(String[] args) {
//    boolean flag = true;
//
//    try {
//      if (flag) {
//        while (true) {
//        }
//      } else {
//        System.exit(1);
//      }
//    } finally {
//      System.out.println("In Finally");
//    }
//  }

//  public static void main(String[] args) {
//    String str = null;
//    String str1="abc";
//    System.out.println(str1.equals("abc") || str.equals(null));
//  }

//  public static void main(String[] args) {
//    String x = "abc";
//    String y = "abc";
//    x = x.concat(y);
//    System.out.print(x);
//  }

//  public void main(String[] args) {
//
//    int x = 10*10-10;
//
//    System.out.println(x);
//  }

//  public static void main(String[] args) {
//    try {
//      throw new IOException("Hello");
//    }catch(IOException | Exception e) {
//      System.out.println(e.getMessage());
//    }
//  }
}