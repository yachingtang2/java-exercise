package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatedCharacterTest {
  private FirstNonRepeatedCharacter firstNonRepeatedCharacter = new FirstNonRepeatedCharacter();

  @Test
  void find_aa_none() {
    char result = firstNonRepeatedCharacter.find("aa");

    assertEquals(result, '\u0000');
  }

  @Test
  void find_ab_a() {
    char result = firstNonRepeatedCharacter.find("ab");

    assertEquals(result, 'a');
  }

  @Test
  void find_aba_b() {
    char result = firstNonRepeatedCharacter.find("aba");

    assertEquals(result, 'b');
  }

  @Test
  void find_abac_c() {
    char result = firstNonRepeatedCharacter.find("ababc");

    assertEquals(result, 'c');
  }

  @Test
  void find_A_sentencea_s() {
    char result = firstNonRepeatedCharacter.find("A sentencea");

    assertEquals(result, 'A');
  }

  @Test
  void find_A_sentenceA_s() {
    char result = firstNonRepeatedCharacter.find("A sentenceA");

    assertEquals(result, 's');
  }

  @Test
  void find_A_sententcceA_s() {
    char result = firstNonRepeatedCharacter.find("A sententcceA s");

    assertEquals(result, '\u0000');
  }
}
