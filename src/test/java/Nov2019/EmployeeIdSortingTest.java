package Nov2019;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class EmployeeIdSortingTest {

  @Test
  void sortById() {
    Employee employee1 = new Employee(5, "Ted");
    Employee employee2 = new Employee(2, "Jake");
    List<Employee> employees = Arrays.asList(employee1, employee2);

    Collections.sort(employees);
    MatcherAssert.assertThat(employees.get(0).getId(), is(2));
    MatcherAssert.assertThat(employees.get(1).getId(), is(5));
  }
}
