package Jun2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubstringSorting {

  public String sortSubString(String string, int from, int to) {
    String extractedSubstring = string.substring(from, to+1);
    String sortedString = sortInDescendingOrder(extractedSubstring);

    return concatenateString(string, sortedString, from, to);
  }

  private String concatenateString(String string, String sortedString, int from, int to) {
    StringBuilder stringBuilder = new StringBuilder();

    stringBuilder.append(string.substring(0, from));
    stringBuilder.append(sortedString);
    stringBuilder.append(string.substring(to+1, string.length()));

    return stringBuilder.toString();
  }

  public String sortInDescendingOrder(String string) {
    char[] charArray = string.toCharArray();
    List<Character> charList = new ArrayList<>();

    for(int i = 0; i < charArray.length; i++) {
      charList.add(charArray[i]);
    }

    Collections.sort(charList);

    return reverseInDescendingOrder(charList);
  }

  private String reverseInDescendingOrder(List<Character> charList) {
    Object[] charArray = charList.toArray();
    StringBuilder stringBuilder = new StringBuilder();

    for(int i = charArray.length-1; i >= 0; i--) {
      stringBuilder.append((char) charArray[i]);
    }

    return stringBuilder.toString();
  }
}
