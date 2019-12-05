package Jun2018;

public enum Person {
  BABY(1),
  TEEN(19),
  ADULT(21);

  private final int age;

  Person(int age) {
    this.age = age;
  }

  public int age() {
    return age;
  }
}

//public enum Jun2018.Person {
//  BABY(1, "Baby"),
//  TEEN(15, "Teen"),
//  ADULT(21, "Adult");
//
//  private final int age;
//  private final String text;
//
//  Jun2018.Person(int age, String text) {
//    this.age = age;
//    this.text = text;
//  }
//
//  public int age() {
//    return this.age;
//  }
//
//  public String text() {
//    return this.text;
//  }
//}
