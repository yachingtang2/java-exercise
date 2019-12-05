package Jun2018;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SortComparatorLambdaTest {
  private List<Person> persons;

  @Test
  void compareSamePerson() {
    persons = Arrays.asList(Person.BABY, Person.BABY, Person.BABY);
    persons.sort((person1, person2) -> person1.age() - person2.age());
    persons.sort(Comparator.comparing(Person::age));
    persons.sort(Comparator.comparingInt(Person::age));
    assertThat(persons.size(), is(3));
    MatcherAssert.assertThat(persons.get(0), Matchers.is(Person.BABY));
    MatcherAssert.assertThat(persons.get(1), Matchers.is(Person.BABY));
    MatcherAssert.assertThat(persons.get(2), Matchers.is(Person.BABY));
  }

  @Test
  void compareDifferentPersonsLambdaAscending() {
    persons = Arrays.asList(Person.ADULT, Person.BABY);
    persons.sort((person1, person2) -> person1.age() - person2.age());
    assertThat(persons.size(), is(2));
    MatcherAssert.assertThat(persons.get(0), Matchers.is(Person.BABY));
    MatcherAssert.assertThat(persons.get(1), Matchers.is(Person.ADULT));
  }

  @Test
  void compareDifferentPersonsLambdaDescending() {
    persons = Arrays.asList(Person.ADULT, Person.BABY);
    persons.sort((person1, person2) -> person2.age() - person1.age());
    assertThat(persons.size(), is(2));
    MatcherAssert.assertThat(persons.get(0), Matchers.is(Person.ADULT));
    MatcherAssert.assertThat(persons.get(1), Matchers.is(Person.BABY));
  }

  @Test
  void compareDifferentPersonsClassReverse() {
    persons = Arrays.asList(Person.ADULT, Person.TEEN, Person.BABY);
    persons.sort(new SortByAge());
//    persons.sort((person1, person2) -> person2.age() - person1.age());
//    persons.sort(Comparator.comparing(Jun2018.Person::age));
//    Comparator<Jun2018.Person> ageComparator = (person1, person2) -> person1.age().compareTo(person.age());
//    persons.sort(ageComparator);
    assertThat(persons.size(), is(3));
    MatcherAssert.assertThat(persons.get(0), Matchers.is(Person.ADULT));
    MatcherAssert.assertThat(persons.get(1), Matchers.is(Person.TEEN));
    MatcherAssert.assertThat(persons.get(2), Matchers.is(Person.BABY));
  }

  @Test
  void compareDifferentPersonsComparatorReverse() {
    persons = Arrays.asList(Person.BABY, Person.TEEN);
    Comparator<Person> personComparator = (person1, person2) -> person2.age() - person1.age();
    persons.sort(personComparator);
    assertThat(persons.size(), is(2));
    MatcherAssert.assertThat(persons.get(0), Matchers.is(Person.TEEN));
    MatcherAssert.assertThat(persons.get(1), Matchers.is(Person.BABY));
  }
}

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class SortComparatorLambdaTest {
//  private List<Jun2018.Person> persons;
//
//  @BeforeEach
//  void setUp() {
//    persons = new ArrayList<>();
//  }
//
//  @Test
//  void sortSamePerson() {
//    persons.add(Jun2018.Person.ADULT);
//    persons.add(Jun2018.Person.ADULT);
////    persons.sort(new Jun2018.SortByAge());
//    persons.sort((person1, person2) -> person1.age() - person2.age());
//    persons.sort(Comparator.comparing(person -> person.age()));
//    persons.sort(Comparator.comparing(Jun2018.Person::age));
//    persons.sort(Comparator.comparingInt(Jun2018.Person::age));
//    assertEquals(2, persons.size());
//    assertEquals(Jun2018.Person.ADULT, persons.get(0));
//    assertEquals(Jun2018.Person.ADULT, persons.get(1));
//  }
//
//  @Test
//  void sortBabyToAdult() {
//    persons.add(Jun2018.Person.ADULT);
//    persons.add(Jun2018.Person.BABY);
//    persons.sort(new Jun2018.SortByAge());
//    assertEquals(2, persons.size());
//    assertEquals(Jun2018.Person.BABY, persons.get(0));
//    assertEquals(Jun2018.Person.ADULT, persons.get(1));
//  }
//
//  @Test
//  void sortPersons() {
//    persons.add(Jun2018.Person.TEEN);
//    persons.add(Jun2018.Person.BABY);
//    persons.add(Jun2018.Person.ADULT);
//    persons.sort(new Jun2018.SortByAge());
//    assertEquals(3, persons.size());
//    assertEquals(Jun2018.Person.BABY, persons.get(0));
//    assertEquals(Jun2018.Person.TEEN, persons.get(1));
//    assertEquals(Jun2018.Person.ADULT, persons.get(2));
//  }
//}
