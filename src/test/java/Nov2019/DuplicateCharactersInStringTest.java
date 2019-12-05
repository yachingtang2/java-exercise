package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

class DuplicateCharactersInStringTest {
  private DuplicateCharactersInString duplicateCharactersInString;

  @BeforeEach
  void setUp() {
    duplicateCharactersInString = new DuplicateCharactersInString();
  }

  @Test
  void noDuplicate() {
    var result = duplicateCharactersInString.findDuplicate("Hi");
    assertThat(result.size(), is(0));
  }

  @Test
  void duplicateA2Times() {
    var result = duplicateCharactersInString.findDuplicate("Java");
    assertThat(result.size(), is(1));
    assertThat(result.keySet(), contains('a'));
    assertThat(result.values(), contains(2));
  }

  @Test
  void duplicateONI2Times() {
    var result = duplicateCharactersInString.findDuplicate("Combination");
    assertThat(result.size(), is(3));
    assertThat(result.keySet(), contains('o', 'i', 'n'));
    assertThat(result.values(), contains(2, 2, 2));
  }
}
