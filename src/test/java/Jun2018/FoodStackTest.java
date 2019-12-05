package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodStackTest {

  private FoodStack foodStack = new FoodStack();

  @Test
  public void noFood() {
    String result = foodStack.isEmpty() ? "No Food" : "Has Food";

    assertEquals("No Food", result);
  }

  @Test
  public void pushFive() {
    Object result;
    foodStack.push(5);

    result = foodStack.peek();

    assertEquals(5, result);
  }

  @Test
  public void pushSeven() {
    Object result;
    foodStack.push(5);
    foodStack.push(7);

    result = foodStack.peek();

    assertEquals(7, result);
  }

  @Test
  public void pushNine() {
    Object result;
    foodStack.push(5);
    foodStack.push(7);
    foodStack.push(9);

    result = foodStack.peek();

    assertEquals(9, result);
  }

  @Test
  public void popNine() {
    Object result;
    foodStack.push(5);
    foodStack.push(7);
    foodStack.push(9);

    result = foodStack.pop();

    assertEquals(9, result);
  }

  @Test
  public void popSeven() {
    Object result;
    foodStack.push(5);
    foodStack.push(7);
    foodStack.push(9);
    foodStack.pop();

    result = foodStack.pop();

    assertEquals(7, result);
  }
}
