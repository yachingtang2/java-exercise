package Jun2018;

public class LongestUniformSubstring {
  public int[] search(String string) {
    int longestStart = -1;
    int longestLength = 0;
    int currentStart = -1;
    int currentLength = 0;
    String currentString = null;

    if (string.length() == 0) {
      return new int[] {longestStart, longestLength};
    }
    for (int i = 0; i < string.length(); i++) {
      if (i == 0 && currentString == null) {
        currentString = string.substring(i, i+1);
        currentLength++;
        currentStart = i;
      }
      else if (currentString != null && currentString.equals(string.substring(i, i+1))) {
        currentLength++;
      }
      else if (currentString != null && !currentString.equals(string.substring(i, i+1))) {
        currentString = string.substring(i, i+1);

        if (currentLength > longestLength) {
          longestLength = currentLength;
          longestStart = currentStart;
        }
        currentLength = 1;
        currentStart = i;
      }
    }

    if (currentLength > longestLength) {
      longestLength = currentLength;
      longestStart = currentStart;
    }

    return new int[] {longestStart, longestLength};
  }
}
