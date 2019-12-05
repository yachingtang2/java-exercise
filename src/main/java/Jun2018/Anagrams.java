package Jun2018;

import java.util.*;

public class Anagrams {
  public int makeAnagram(String a, String b) {
//    char[] aChars = a.toCharArray();
//    char[] bChars = b.toCharArray();
//    Arrays.sort(aChars);
//    Arrays.sort(bChars);

    Map<Character, Integer> aCharacterMap = populateCharacterArrayToMap(a.toCharArray());
    Map<Character, Integer> bCharacterMap = populateCharacterArrayToMap(b.toCharArray());

//    System.out.println(aCharacterMap.toString());
//    System.out.println(bCharacterMap.toString());

    return compareCharacterMaps(aCharacterMap, bCharacterMap);
  }

  private int compareCharacterMaps(Map<Character, Integer> aCharacterMap, Map<Character, Integer> bCharacterMap) {
    int count = 0;
    for(Character character : aCharacterMap.keySet()) {
      count += Math.abs(aCharacterMap.get(character) - bCharacterMap.get(character));
    }
    return count;
  }

  public Map<Character, Integer> populateCharacterArrayToMap(char[] characters) {
    Map<Character, Integer> characterMap = initializeCharacterMap();
    for (int i = 0; i < characters.length; i++) {
      if (characterMap.containsKey(characters[i])) {
        int count = characterMap.get(characters[i]);
        characterMap.put(characters[i], ++count);
      }
    }
    return characterMap;
  }

  public Map<Character, Integer> initializeCharacterMap () {
    char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    Map<Character, Integer> characterMap = new LinkedHashMap<>();
    for (int i = 0; i < alphabets.length; i++) {
      characterMap.put(alphabets[i], 0);
    }
    return characterMap;
  }
}
