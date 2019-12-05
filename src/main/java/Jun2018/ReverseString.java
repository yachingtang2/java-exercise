package Jun2018;

public class ReverseString {
  public String reverse(String string) {
    char[] charArray = string.toCharArray();
    String reversedString = "";

    for(int i = charArray.length-1; i >= 0; i--) {
      reversedString += charArray[i];
    }
    return reversedString;
  }
}
