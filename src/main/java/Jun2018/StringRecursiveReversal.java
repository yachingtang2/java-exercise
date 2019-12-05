package Jun2018;

public class StringRecursiveReversal {
  public String reverseString(String stringToReverse) {
    if (stringToReverse.length() == 1) {
      return stringToReverse;
    }
    String reversedString =
        stringToReverse.charAt(stringToReverse.length()-1) +
            reverseString(stringToReverse.substring(0, stringToReverse.length()-1));
    return reversedString;
  }


//  public String reverseString() {
////    char[] stringInChars = stringToReverse.toCharArray();
////    StringBuilder reversedString = new StringBuilder();
////
////    for (int i = stringInChars.length-1; i >= 0; i--) {
////      reversedString.append(stringInChars[i]);
////    }
////    return reversedString.toString();
////  }
}
