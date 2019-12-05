package Jun2018;

public class GoodString {

  public int countGoodString(String string) {
    String vowelString = "aeiou";
    char[] stringInChars = string.toCharArray();
    int longestGoodString = 0;
    int currentGoodStringLength = 0;

    for(int i = 0; i < stringInChars.length; i++) {
      if(vowelString.contains(string.charAt(i)+"")) {
        longestGoodString++;
      }
      else {
        if(longestGoodString > currentGoodStringLength) {
          currentGoodStringLength = longestGoodString;
        }

        longestGoodString = 0;
      }
    }

    return longestGoodString > currentGoodStringLength ? longestGoodString : currentGoodStringLength;
  }
}
