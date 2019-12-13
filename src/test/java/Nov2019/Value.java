package Nov2019;

public class Value {

  private int id;
  private String quote;

  public Value() {
  }

  public int getId() {
    return this.id;
  }

  public String getQuote() {
    return this.quote;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  @Override
  public String toString() {
    return "Value{" +
        "id=" + id +
        ", quote='" + quote + '\'' +
        '}';
  }
}
