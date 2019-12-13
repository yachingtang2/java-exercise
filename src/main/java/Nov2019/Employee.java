package Nov2019;

class Employee implements Comparable<Employee> {

  private int id;
  private String firstName;

  Employee(int id, String firstName) {
    this.id = id;
    this.firstName = firstName;
  }

  int getId() {
    return this.id;
  }

  String getFirstName() {
    return this.firstName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Employee employee = (Employee) o;

    if (id != employee.id) return false;
    return firstName.equals(employee.firstName);
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + firstName.hashCode();
    return result;
  }

  @Override
  public int compareTo(Employee employee) {
//    Employee e = new Employee(3, "Testing");
    return employee.getId() - this.getId();
  }
}
