package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringContainTest {

  private StringContain stringContain;

  @BeforeEach
  void setUp() {
    stringContain = new StringContain();
  }

  @Test
  void containFalse() {
    String[] array1 = { "ab" };
    String[] array2 = { "nbc" };

    String[] strings = stringContain.contains(array1, array2);

    assertThat(strings.length).isEqualTo(0);
  }

  @Test
  void containTrue() {
    String[] array1 = { "ab" };
    String[] array2 = { "abc" };

    String[] strings = stringContain.contains(array1, array2);

    assertThat(strings.length).isEqualTo(1);
    assertThat(strings).containsExactly("abc");
  }

  @Test
  void containTwoTrue() {
    String[] array1 = { "ab" };
    String[] array2 = { "abc", "aab" };

    String[] strings = stringContain.contains(array1, array2);

    assertThat(strings.length).isEqualTo(2);
    assertThat(strings).containsExactly("aab", "abc");
  }

  @Test
  void containUniqueTwoTrue() {
    String[] array1 = { "ab" };
    String[] array2 = { "abc", "aab", "abc" };

    String[] strings = stringContain.contains(array1, array2);

    assertThat(strings.length).isEqualTo(2);
    assertThat(strings).containsExactly("aab", "abc");
  }

  @Test
  void containUniqueThreeTrue() {
    String[] array1 = { "bc", "ab", "ac" };
    String[] array2 = { "nbc", "abc", "cbs", "aab" };

    String[] strings = stringContain.contains(array1, array2);

    assertThat(strings.length).isEqualTo(3);
    assertThat(strings).containsExactly("aab", "abc", "nbc");
  }
}
