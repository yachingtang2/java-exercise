package Nov2019;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class EmployeeIdSortingTest {

  @Test
  void sortById() {
    Employee employee1 = new Employee(5, "Ted");
    Employee employee2 = new Employee(2, "Jake");
    List<Employee> employees = Arrays.asList(employee1, employee2);

    Collections.sort(employees);
    MatcherAssert.assertThat(employees.get(0).getId(), is(5));
    MatcherAssert.assertThat(employees.get(1).getId(), is(2));

    Set<Integer> integerSet = new HashSet<>();
    integerSet.add(1);
    integerSet.add(5);
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(7);
    System.out.println("YCT - integerSet = " + integerSet.toString());
    int total = integerSet.stream().mapToInt(Integer::intValue).sum();
  }
}
