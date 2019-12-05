package Jun2018;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramsTest {
  private Anagrams anagrams = new Anagrams();

  @Test
  public void oneIdenticalCharacter() {
    int count = anagrams.makeAnagram("a", "a");

    assertEquals(0, count);
  }

  @Test
  public void oneDifferentCharacter() {
    int count = anagrams.makeAnagram("a", "ba");

    assertEquals(1, count);
  }

  @Test
  public void twoDifferentCharacters() {
    int count = anagrams.makeAnagram("a", "bea");

    assertEquals(2, count);
  }

  @Test
  public void cdeANDabc() {
    int count = anagrams.makeAnagram("cde", "abc");

    assertEquals(4, count);

    Map<Character, Integer> map = new HashMap<>();
    map.put(null, 3);
    map.put(null, null);
    map.put('a', null);
    map.put('b', null);
    map.put('c', 1);
    map.put('c', 2);
    map.put('a', 5);
    System.out.println(map.toString());
  }
}
