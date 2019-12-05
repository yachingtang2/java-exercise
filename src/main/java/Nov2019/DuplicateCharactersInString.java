package Nov2019;

import java.util.LinkedHashMap;
import java.util.Map;

class DuplicateCharactersInString {
  public Map<Character, Integer> findDuplicate(String word) {
    var duplicateCharacters = new LinkedHashMap<Character, Integer>();

    for(char character : word.toCharArray()) {
      var count = 0;
      if(duplicateCharacters.containsKey(character)) {
        count = duplicateCharacters.get(character);
      }
      duplicateCharacters.put(character, ++count);
    }

    duplicateCharacters.entrySet()
        .removeIf(characterIntegerEntry -> characterIntegerEntry.getValue() < 2);

    return duplicateCharacters;
  }
}
