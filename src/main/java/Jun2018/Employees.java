package Jun2018;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
  private List<String> employees;

  public Employees() {
    this.employees = new ArrayList<>();
  }

  public Employees(List<String> employees) {
    this.employees = employees;
  }

  public void loadData() {
    employees.add("a");
    employees.add("b");
    employees.add("c");
    employees.add("d");
  }

  public List<String> getEmployees() {
    return employees;
  }

  public Object clone() {
    List<String> clonedEmployees = new ArrayList<>();

    for (String string : this.getEmployees()) {
      clonedEmployees.add(string);
    }

    return new Employees(clonedEmployees);
  }
}
