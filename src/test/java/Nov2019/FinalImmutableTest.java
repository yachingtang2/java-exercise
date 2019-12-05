package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FinalImmutableTest {
  private FinalImmutable finalImmutable;

  @BeforeEach
  void setUp() {
    finalImmutable = new FinalImmutable();
  }

  @Test
  void testString() {
    assertThat(finalImmutable.modifyString(), is("String 1"));
  }
}
