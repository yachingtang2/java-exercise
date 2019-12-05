package Jun2018;

public class Queue {
  private Node front;
  private Node rear;

  public Object peek() {
    if (isEmpty()) {
      return null;
    }

    return front.value;
  }

  private class Node {
    private Object value;
    private Node next;

    public Node(Object value) {
      this.value = value;
    }
  }

  public int size() {
    if (isEmpty()) {
      return 0;
    }

    int elementCount = 1;
    Node node = front.next;

    while(node != null) {
      elementCount++;
      node = node.next;
    }
    return elementCount;
  }

  public Object dequeue() {
    if (isEmpty()) {
      return null;
    }

    Object value = front.value;

    Node node = front.next;
    front = node;

    return value;
  }

  public Object peep() {
    return front.value;
  }

  public boolean isEmpty() {
    return front == null;
  }

  public void enqueue(Object value) {
    Node node = new Node(value);

    if (isEmpty()) {
      front = node;
      rear = node;
    } else {
      rear.next = node;
      rear = node;

      if (front.next == null) {
        front.next = rear;
      }
    }
  }
}
