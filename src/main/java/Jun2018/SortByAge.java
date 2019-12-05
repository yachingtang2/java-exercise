package Jun2018;//import java.util.Comparator;
//
//public class Jun2018.SortByAge implements Comparator<Jun2018.Person> {
//
//  @Override
//  public int compare(Jun2018.Person person1, Jun2018.Person person2) {
//    return person1.age() - person2.age();
//  }
//}

import java.util.Comparator;

public class SortByAge implements Comparator<Person> {

  @Override
  public int compare(Person person1, Person person2) {
    return person2.age() - person1.age();
  }
}