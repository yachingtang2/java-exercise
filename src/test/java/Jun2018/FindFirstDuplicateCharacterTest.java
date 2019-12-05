package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstDuplicateCharacterTest {
  private FindFirstDuplicateCharacter findFirstDuplicateCharacter = new FindFirstDuplicateCharacter();

  @Test
  void findDuplicate_one_character() {
    String string = "b";

    char duplicateChar = findFirstDuplicateCharacter.findDuplicate(string);

    assertEquals('\u0000', duplicateChar);
  }

  @Test
  void findDuplicate_two_characters() {
    String string = "bc";

    char duplicateChar = findFirstDuplicateCharacter.findDuplicate(string);

    assertEquals('\u0000', duplicateChar);
  }

  @Test
  void findDuplicate_two_characters_has_duplicate() {
    String string = "bb";

    char duplicateChar = findFirstDuplicateCharacter.findDuplicate(string);

    assertEquals('b', duplicateChar);
  }

  @Test
  void findDuplicate_three_characters() {
    String string = "cac";

    char duplicateChar = findFirstDuplicateCharacter.findDuplicate(string);

    assertEquals('c', duplicateChar);
  }

  @Test
  void findDuplicate_10_characters() {
    String string = "1234567893";

    char duplicateChar = findFirstDuplicateCharacter.findDuplicate(string);

    assertEquals('3', duplicateChar);
  }

  @Test
  void findDuplicate_no_duplicate() {
    String string = "1234567890";

    char duplicateChar = findFirstDuplicateCharacter.findDuplicate(string);

    assertEquals('\u0000', duplicateChar);
  }
}
