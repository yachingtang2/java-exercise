package Nov2019;

import java.util.Arrays;

class StringAnagram {
  public boolean areStringAnagram(String string1, String string2) {
    if(string1.length() != string2.length()) {
      return false;
    }

    char[] charArray1 = string1.toCharArray();
    char[] charArray2 = string2.toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    return Arrays.equals(charArray1, charArray2);

//    if(string1.length() != string2.length()) {
//      return false;
//    }
//    char[] characterArray1 = string1.toCharArray();
//    char[] characterArray2 = string2.toCharArray();
//
//    Arrays.sort(characterArray1);
//    Arrays.sort(characterArray2);
//
//    return Arrays.equals(characterArray1, characterArray2);

//    for(char c : chars){
//      int index = anagram.indexOf(c);
//      if(index != -1) {
//        anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
//      } else {
//        return false;
//      }
//    }
  }
}
