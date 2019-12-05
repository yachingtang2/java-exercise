package Jun2018;

import java.util.Arrays;

public class FirstNonRepeatedCharacter {
  public char find(String string) {

    String newString = string.replaceAll("\\W", "");

    for(int i = 0; i < newString.length(); i++) {
      char currentChar = newString.charAt(i);
      if(newString.indexOf(newString.substring(i,i+1)) == newString.lastIndexOf(newString.substring(i,i+1))) {
        return currentChar;
      }
    }
    return '\u0000';
  }
}
