package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

class ArmstrongNumberTest {
  private ArmstrongNumber armstrongNumber;

  @BeforeEach
  void setUp() {
    armstrongNumber = new ArmstrongNumber();
  }

  @Test
  void isArmstrongNumber2False() {
    boolean result = armstrongNumber.isArmstrongNumber(2);
    assertThat(result, is(false));
    armstrongNumber.rawType();
  }

  @Test
  void isArmstrongNumber1True() {
    boolean result = armstrongNumber.isArmstrongNumber(1);
    assertThat(result, is(true));
  }

  @Test
  void isArmstrongNumber153True() {
    boolean result = armstrongNumber.isArmstrongNumber(153);
    assertThat(result, is(true));
  }

  @Test
  void isArmstrongNumber370True() {
    boolean result = armstrongNumber.isArmstrongNumber(370);
    assertThat(result, is(true));
  }

//  @Test
//  void findArmstrongNumberFrom0To1000() {
//    List<Integer> numbers = armstrongNumber.findArmstrongNumber(1000);
//    assertThat(numbers, contains(0,1,153,370,371,407));
//  }
//
//  @Test
//  void findArmstrongNumberFrom0To10000() {
//    List<Integer> numbers = armstrongNumber.findArmstrongNumber(10000);
//    assertThat(numbers, contains(0,1,153,370,371,407));
//  }
}
