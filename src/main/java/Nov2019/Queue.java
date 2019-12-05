package Nov2019;

class Queue {
  private int size;
  private Node front;

  public boolean isEmpty() {
    return size == 0;
  }

  Object peep() {
    return front != null ? front.value : null;
  }

  void enQueue(Object value) {
    Node node = new Node();
    node.value = value;

    if(front == null) {
      front = node;
    } else {
      Node nextNode = front;
      while(nextNode.next != null) {
        nextNode = nextNode.next;
      }
      nextNode.next = node;
    }

    size++;
  }

  Object deQueue() {
    if(isEmpty()) {
      return null;
    }
    Object deQueuedValue = front.value;
    front = front.next;
    size--;
    return deQueuedValue;
  }

  private static class Node {
    private Object value;
    private Node next;
  }
}
