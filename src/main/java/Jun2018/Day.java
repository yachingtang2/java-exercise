package Jun2018;

public enum Day {
  TUESDAY("Tuesday"), MONDAY("Monday");

  private String day;

  Day(String day) {
    this.day = day;
  }

  public String day() {
    return day;
  }
}
