package Jun2018;

public class FindFirstDuplicateCharacter {
  public char findDuplicate(String string) {
    for(int i = 0; i < string.length(); i++) {
      char currentChar = string.substring(i, i+1).charAt(0);
      int lastCurrentCharIndex = string.lastIndexOf(currentChar);

      if(i != lastCurrentCharIndex) {
        return currentChar;
      }
    }
    return '\u0000';

  }
}
