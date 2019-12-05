package Jun2018;

import java.util.Arrays;

public class LongestSequence {
  public char find(String string) {
    String newString = string.replaceAll("\\W", "");

    char[] chars = newString.toCharArray();

    Arrays.sort(chars);

    char longestSequenceChar = '\u0000';
    int currentLongestSequenceCharCount = 1;
    int longestSequenceCharCount = 0;

    if (chars.length == 1) {
      return chars[0];
    }
    for(int i = 0; i < chars.length-1; i++) {
      if (chars[i] == chars[i+1]) {
        currentLongestSequenceCharCount++;
      } else {
        currentLongestSequenceCharCount = 1;
      }
      if (currentLongestSequenceCharCount > longestSequenceCharCount) {
        longestSequenceCharCount = currentLongestSequenceCharCount;
        longestSequenceChar = chars[i];
      }
    }
    return longestSequenceChar;
  }
}
