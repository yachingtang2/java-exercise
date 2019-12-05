package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ReverseWordsInSentenceTest {
  private ReverseWordsInSentence reverseWordsInSentence;

  @BeforeEach
  void setUp() {
    reverseWordsInSentence = new ReverseWordsInSentence();
  }

  @Test
  void reverseOneWordSentence() {
    String reversedSentence = reverseWordsInSentence.reverse("Hello");
    assertThat(reversedSentence, is("Hello"));
  }

  @Test
  void reverseTwoWordsSentence() {
    String reversedSentence = reverseWordsInSentence.reverse("Hello World");
    assertThat(reversedSentence, is("World Hello"));
  }

  @Test
  void reverseThreeWordsSentence() {
    String reversedSentence = reverseWordsInSentence.reverse("Hello Big World");
    assertThat(reversedSentence, is("World Big Hello"));
  }

  @Test
  void reverseFourWordsSentence() {
    String reversedSentence = reverseWordsInSentence.reverse("You are very nice");
    assertThat(reversedSentence, is("nice very are You"));
  }

  @Test
  void reverseFiveWordsSentence() {
    String reversedSentence = reverseWordsInSentence.reverse("It is Friday evening now");
    assertThat(reversedSentence, is("now evening Friday is It"));
  }
}
