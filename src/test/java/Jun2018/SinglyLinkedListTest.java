package Jun2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinglyLinkedListTest {

  private SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

  @Test
  public void merge() {
    SinglyLinkedList list1 = new SinglyLinkedList();
    SinglyLinkedList list2 = new SinglyLinkedList();
    list1.insertNode(1);
    list1.insertNode(2);
    list1.insertNode(3);
    list2.insertNode(3);
    list2.insertNode(4);

    SinglyLinkedListNode node = singlyLinkedList.merge(list1.head, list2.head);
    String result = singlyLinkedList.printMergedList(node);

    assertEquals("1 2 3 3 4 ", result);
  }

  @Test
  public void mergeList2HasMoreNumbers() {
    SinglyLinkedList list1 = new SinglyLinkedList();
    SinglyLinkedList list2 = new SinglyLinkedList();
    list1.insertNode(1);
    list1.insertNode(2);
    list1.insertNode(3);
    list2.insertNode(1);
    list2.insertNode(2);
    list2.insertNode(4);
    list2.insertNode(4);

    SinglyLinkedListNode node = singlyLinkedList.merge(list1.head, list2.head);
    String result = singlyLinkedList.printMergedList(node);

    assertEquals("1 1 2 2 3 4 4 ", result);
  }

  @Test
  public void mergeFirstOneIsNullList() {
    SinglyLinkedList list1 = new SinglyLinkedList();
    SinglyLinkedList list2 = new SinglyLinkedList();
    list1.insertNode(1);
    list1.insertNode(2);
    list1.insertNode(3);

    SinglyLinkedListNode node = singlyLinkedList.merge(list1.head, list2.head);
    String result = singlyLinkedList.printMergedList(node);

    assertEquals("1 2 3 ", result);
  }

  @Test
  public void mergeSecondOneIsNullList() {
    SinglyLinkedList list1 = new SinglyLinkedList();
    SinglyLinkedList list2 = new SinglyLinkedList();
    list2.insertNode(3);
    list2.insertNode(4);

    SinglyLinkedListNode node = singlyLinkedList.merge(list1.head, list2.head);
    String result = singlyLinkedList.printMergedList(node);

    assertEquals("3 4 ", result);
  }

  @Test
  public void mergeTwoNullLists() {
    SinglyLinkedList list1 = new SinglyLinkedList();
    SinglyLinkedList list2 = new SinglyLinkedList();

    SinglyLinkedListNode node = singlyLinkedList.merge(list1.head, list2.head);
    String result = singlyLinkedList.printMergedList(node);

    assertEquals("", result);
  }

  @Test
  public void mergeSameNumbers() {
    SinglyLinkedList list1 = new SinglyLinkedList();
    SinglyLinkedList list2 = new SinglyLinkedList();
    list1.insertNode(1);
    list1.insertNode(1);
    list1.insertNode(1);
    list2.insertNode(1);
    list2.insertNode(1);

    SinglyLinkedListNode node = singlyLinkedList.merge(list1.head, list2.head);
    String result = singlyLinkedList.printMergedList(node);

    assertEquals("1 1 1 1 1 ", result);
  }
}
