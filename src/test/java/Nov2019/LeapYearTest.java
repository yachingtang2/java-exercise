package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class LeapYearTest {
  private LeapYear leapYear;

  @BeforeEach
  void setUp() {
    leapYear = new LeapYear();
  }

  @Test
  void isLeapYear1False() {
    boolean isLeapYear = leapYear.isLeapYear(1);
    assertThat(isLeapYear, is(false));
  }

  @Test
  void isLeapYear2020true() {
    boolean isLeapYear = leapYear.isLeapYear(2020);
    assertThat(isLeapYear, is(true));
  }

  @Test
  void isLeapYear2352true() {
    boolean isLeapYear = leapYear.isLeapYear(2352);
    assertThat(isLeapYear, is(true));
  }

  @Test
  void isLeapYear1800False() {
    boolean isLeapYear = leapYear.isLeapYear(1800);
    assertThat(isLeapYear, is(false));
  }

  @Test
  void isLeapYear1600False() {
    boolean isLeapYear = leapYear.isLeapYear(1600);
    assertThat(isLeapYear, is(true));
  }
}
