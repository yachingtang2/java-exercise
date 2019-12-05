package Jun2018;

class SinglyLinkedListNode {
  public int data;
  public SinglyLinkedListNode next;

  public SinglyLinkedListNode(int nodeData) {
    this.data = nodeData;
    this.next = null;
  }
}

public class SinglyLinkedList {
  public SinglyLinkedListNode head;
  public SinglyLinkedListNode tail;

  public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void insertNode(int nodeData) {
    SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

    if (this.head == null) {
      this.head = node;
    } else {
      this.tail.next = node;
    }

    this.tail = node;
  }

  public SinglyLinkedListNode merge(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    SinglyLinkedList mergedList = new SinglyLinkedList();

    while(head1 != null && head2 != null) {
      if (head1.data < head2.data) {
        mergedList.insertNode(head1.data);
        head1 = head1.next;
      } else if (head1.data > head2.data) {
        mergedList.insertNode(head2.data);
        head2 = head2.next;
      } else if (head1.data == head2.data) {
        mergedList.insertNode(head1.data);
        mergedList.insertNode(head2.data);
        head1 = head1.next;
        head2 = head2.next;
      }
    }

    if(head1 != null && mergedList.head != null) {
      mergedList.tail.next = head1;
    }
    else if(head1 != null && mergedList.head == null) {
      while (head1 != null) {
        mergedList.insertNode(head1.data);
        head1 = head1.next;
      }
    }
    if(head2 != null && mergedList.head != null) {
      mergedList.tail.next = head2;
    }
    else if(head2 != null && mergedList.head == null) {
      while (head2 != null) {
        mergedList.insertNode(head2.data);
        head2 = head2.next;
      }
    }

    printMergedList(mergedList.head);
    return mergedList.head;
  }

  public String printMergedList(SinglyLinkedListNode node) {
    StringBuffer stringBuffer = new StringBuffer();

    while(node != null) {
      System.out.print(node.data + " ");
      stringBuffer.append(node.data + " ");
      node = node.next;
    }

    return stringBuffer.toString();
  }
}
