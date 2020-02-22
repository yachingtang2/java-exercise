package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class CountNinesTest {

  private CountNines countNines;

  @BeforeEach
  void setUp() {
    countNines = new CountNines();
  }

  @Test
  void nine5None() {
    int[] array = IntStream.rangeClosed(1, 5).toArray();

    int totalNines = countNines.count(array);

    assertThat(totalNines).isEqualTo(0);
  }

  @Test
  void nine10Nine() {
    int[] array = IntStream.rangeClosed(1, 10).toArray();

    int totalNines = countNines.count(array);

    assertThat(totalNines).isEqualTo(1);
  }

  @Test
  void nine20Nine() {
    int[] array = IntStream.rangeClosed(1, 20).toArray();

    int totalNines = countNines.count(array);

    assertThat(totalNines).isEqualTo(2);
  }

  @Test
  void nine80Nine() {
    int[] array = IntStream.rangeClosed(1, 80).toArray();

    int totalNines = countNines.count(array);

    assertThat(totalNines).isEqualTo(8);
  }

  @Test
  void nine90Nine() {
    int[] array = IntStream.rangeClosed(1, 90).toArray();

    int totalNines = countNines.count(array);

    assertThat(totalNines).isEqualTo(10);
  }

  @Test
  void nine91Nine() {
    int[] array = IntStream.rangeClosed(1, 91).toArray();

    int totalNines = countNines.count(array);

    assertThat(totalNines).isEqualTo(11);
  }

  @Test
  void nine100Nine() {
    int[] array = IntStream.rangeClosed(1, 100).toArray();

    int totalNines = countNines.count(array);

    assertThat(totalNines).isEqualTo(20);
  }

  @Test
  void nine1000Nine() {
    int[] array = IntStream.rangeClosed(1, 1000).toArray();

    int totalNines = countNines.count(array);

    assertThat(totalNines).isEqualTo(300);
  }

  @Test
  void nine10000Nine() {
    int[] array = IntStream.rangeClosed(1, 10000).toArray();

    int totalNines = countNines.count(array);

    assertThat(totalNines).isEqualTo(4000);
  }
}