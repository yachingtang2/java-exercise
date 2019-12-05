package Jun2018;

public class FoodStack {

  private Node top;

  private class Node {
    Object object;
    Node next;

    public Node(Object object) {
      this.object = object;
      next = null;
    }
  }

  public boolean isEmpty() {
    return top == null ? true : false;
  }

  public void push(Object object) {
    Node node = new Node(object);

    if(top == null) {
      top = node;
    }
    else {
      node.next = top;
      top = node;
    }
  }

  public Object peek() {
    return top != null ? top.object : null;
  }

  public Object pop() {
    if(isEmpty()) {
      return null;
    }

    Object object = top.object;
    top = top.next;

    return object;
  }
}
