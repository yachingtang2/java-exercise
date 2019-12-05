package Jun2018;

public class Stack {

  private Node top;

  private class Node {
    private Object value;
    private Node next;

    public Node(Object value) {
      this.value = value;
    }
  }

  public boolean isEmpty() {
    return top == null;
  }

  public void push(Object value) {
    Node node = new Node(value);
    node.next = top;
    top = node;
  }

  public Object pop() {
    if (isEmpty()) {
      return null;
    }
    Object value = top.value;
    top = top.next;
    return value;
  }

  public Object peep() {
    return isEmpty() ? null : top.value;
  }

  public int size() {
    if (isEmpty()) {
      return 0;
    }
    Node node = top;
    int nodeCount = 1;

    while(node.next != null) {
      nodeCount++;
      node = node.next;
    }
    return nodeCount;
  }
}
