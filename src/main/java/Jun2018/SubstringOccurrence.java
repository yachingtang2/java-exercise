package Jun2018;

public class SubstringOccurrence {
  public int findSubString(String stringToFind, String string) {
    int occurrences = 0;
    int index = 0;

    while(index >= 0 && index < string.length()) {
      index = string.indexOf(stringToFind, index);
      if(index >= 0) {
        occurrences++;
        index++;
      }
    }
    return occurrences;
  }
}
