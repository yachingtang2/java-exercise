package Nov2019;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class DuplicateCharactersInString {
  public Map<Character, Integer> findDuplicate(String word) {
    Map<Character, Integer> characters = new LinkedHashMap<>();
    Map<Character, Integer> duplicates = new LinkedHashMap<>();

    char[] wordArray = word.toCharArray();

    for(char character: wordArray) {
      int count = characters.get(character) == null ? 0 : characters.get(character);

      characters.put(character, ++count);
    }

    for(Map.Entry<Character, Integer> entrySet : characters.entrySet()) {
      if(entrySet.getValue() > 1) {
        duplicates.put(entrySet.getKey(), entrySet.getValue());
      }
    }
    return duplicates;






















//    var duplicateCharacters = new LinkedHashMap<Character, Integer>();
//
//    for(char character : word.toCharArray()) {
//      var count = 0;
//      if(duplicateCharacters.containsKey(character)) {
//        count = duplicateCharacters.get(character);
//      }
//      duplicateCharacters.put(character, ++count);
//    }
//
//    duplicateCharacters.entrySet()
//        .removeIf(characterIntegerEntry -> characterIntegerEntry.getValue() < 2);
//
//    return duplicateCharacters;
  }
}
