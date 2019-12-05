package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class StringAnagramTest {
  private StringAnagram stringAnagram;

  @BeforeEach
  void setUp() {
    stringAnagram = new StringAnagram();
  }

  @Test
  void hiHeyNotStringAnagram() {
    assertThat(stringAnagram.areStringAnagram("hi", "hey"), is(false));
  }

  @Test
  void maryArmyAreStringAnagram() {
    assertThat(stringAnagram.areStringAnagram("mary", "army"), is(true));
  }

  @Test
  void potsPotsAreStringAnagram() {
    assertThat(stringAnagram.areStringAnagram("pots", "pots"), is(true));
  }
}
