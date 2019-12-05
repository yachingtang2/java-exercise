package Jun2018;

public class Palindrome {
  public boolean isPalindrome(String string) {
    String stringWithoutSpaces = string.replaceAll("\\W", "").toLowerCase();

    char[] chars = stringWithoutSpaces.toCharArray();
    char[] reversedChars = new char[chars.length];

    for(int i = chars.length-1, j = 0; i >= 0; i--, j++) {
       reversedChars[j] = chars[i];
    }

    for (int i = 0; i < chars.length; i++) {
      if(chars[i] != reversedChars[i]) {
        return false;
      }
    }

    return true;
//    StringBuilder stringBuilder = new StringBuilder(stringWithoutSpaces.toLowerCase());
//
//    String reversedString = stringBuilder.reverse().toString();
//
//    return stringWithoutSpaces.toLowerCase().equals(reversedString);
  }

//  public boolean isPalindrome(String string) {
//    String stringWithoutSpaces = string.replaceAll("\\W", "");
//    StringBuilder stringBuilder = new StringBuilder(stringWithoutSpaces.toLowerCase());
//
//    String reversedString = stringBuilder.reverse().toString();
//
//    return stringWithoutSpaces.toLowerCase().equals(reversedString);
//  }
}
