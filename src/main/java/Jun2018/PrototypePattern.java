package Jun2018;

import java.util.List;

public class PrototypePattern {
  public static void main(String[] args) {
    Employees employees = new Employees();

    employees.loadData();

    Employees employees1 = (Employees) employees.clone();
    Employees employees2 = (Employees) employees.clone();

    List<String> list1 = employees1.getEmployees();
    list1.add("y");

    List<String> list2 = employees2.getEmployees();
    list2.remove("a");

    System.out.println("employees = " + employees.getEmployees());
    System.out.println("list1 = " + list1);
    System.out.println("list2 = " + list2);
  }
}
