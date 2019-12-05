package Nov2019;

class Stack {
  private int size;
  private Node top;

  public int size() {
    return size;
  }

  Object peep() {
    return top != null ? top.value : null;
  }

  private static class Node {
    private Object value;
    private Node next;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  void push(Object value) {
    Node node = new Node();
    node.value = value;

    node.next = top;
    top = node;

    size++;
  }

  Object pop() throws StackEmptyException {
    if(isEmpty()) {
      throw new StackEmptyException();
    }
    Object poppedValue = top.value;
    size--;
    top = top.next;

    return poppedValue;
  }
}
