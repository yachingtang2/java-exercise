package Jun2018;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PredicateExampleTest {

  private Predicate<Integer> integerPredicate;
  private Predicate<String> predicate1 = string -> string.length() < 5;
  private Predicate<String> predicate2 = string -> string.startsWith("A");

  @Test
  void integerValueGreaterThan100True() {
    integerPredicate = value -> value > 100;
    assertThat(integerPredicate.test(1000), is(true));
  }

  @Test
  void integerValueGreaterThan50False() {
    integerPredicate = value -> value > 50;
    assertThat(integerPredicate.test(3), is(false));
  }

  @Test
  void nameStartsWithAAndLengthLessThan5() {
    List<String> names = Arrays.asList("Brad", "Adam", "Apple");
    List<String> results = names.stream()
        .filter(predicate1.and(predicate2))
        .collect(Collectors.toList());
    assertThat(results.size(), is(1));
    assertThat(results.get(0), is("Adam"));
  }

  @Test
  void nameStartsWithAAndLengthLssThan5None() {
    List<String> names = Arrays.asList("Joan", "Angie");
    List<String> result = names.stream()
        .filter(predicate2.and(predicate1))
        .collect(Collectors.toList());
    assertThat(result.isEmpty(), is(true));
  }
}



//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.contains;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//class PredicateExampleTest {
//
//  private Predicate<Integer> predicateExample;
//  Predicate<String> predicate1;
//  Predicate<String> predicate2;
//  private List<String> names;
//
//  @BeforeEach
//  void setUp() {
//    predicateExample = value -> value > 100;
//    predicate1 =  str -> str.startsWith("A");
//    predicate2 =  str -> str.length() < 5;
//    names = Arrays.asList("Ava", "Grape", "Adam");
//  }
//
//  @Test
//  void predicateGreaterThan100False() {
//    assertFalse(predicateExample.test(1));
//  }
//
//  @Test
//  void predicateGreaterThan100True() {
//    assertTrue(predicateExample.test(1000));
//  }
//
//  @Test
//  void filterListWithTwoPredicatesUsingAnd() {
//    List<String> result = names.stream()
//        .filter(predicate1.and(predicate2))
//        .collect(Collectors.toList());
//
//    assertEquals(2, result.size());
//    assertEquals("Ava", result.get(0));
//    assertEquals("Adam", result.get(1));
//    assertThat(result, contains("Ava", "Adam"));
//  }
//
//  @Test
//  void filterListWithTwoPredicatesUsingNegate() {
//    List<String> result = names.stream()
//        .filter(predicate1.and(predicate2.negate()))
//        .collect(Collectors.toList());
//
//    assertEquals(0, result.size());
//  }
//}
