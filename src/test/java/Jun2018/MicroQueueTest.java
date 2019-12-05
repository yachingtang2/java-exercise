package Jun2018;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MicroQueueTest {
  private MicroQueue microQueue = new MicroQueue();

  @Test
  public void enqueueTwo() {
    int result = microQueue.operate("E 2");

    assertEquals(1, result);
  }

  @Test
  public void enqueueTwoDequeue() {
    microQueue.operate("E 2");
    int result = microQueue.operate("D");
    int removedElement = microQueue.getRemovedElements().get(0);

    assertEquals(2, removedElement);
    assertEquals(0, result);
  }

  @Test
  public void enqueueTwoDequeueDequeue() {
    microQueue.operate("E 2");
    microQueue.operate("D");
    int result = microQueue.operate("D");
    List<Integer> removedElements = microQueue.getRemovedElements();
    int removedElement = removedElements.get(removedElements.size()-1);

    assertEquals(-1, removedElement);
    assertEquals(0, result);
  }

  @Test
  public void enqueue2DequeueDequeueEnqueue3() {
    microQueue.operate("E 2");
    microQueue.operate("D");
    microQueue.operate("D");
    int result = microQueue.operate("E 3");

    assertEquals(1, result);
  }

  @Test
  public void enqueue2DequeueDequeueEnqueue3Dequeue() {
    int result = microQueue.operate("E 2");
    result = microQueue.operate("D");
    result = microQueue.operate("D");
    result = microQueue.operate("E 3");
    result = microQueue.operate("D");
    List<Integer> removedElements = microQueue.getRemovedElements();
    int removedElement = removedElements.get(removedElements.size()-1);

    assertEquals(3, removedElement);
    assertEquals(0, result);
  }
}
