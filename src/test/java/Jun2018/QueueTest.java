package Jun2018;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
  private Queue queue = new Queue();

  @Test
  public void isEmpty() {
    Assertions.assertTrue(queue.isEmpty());
    Assertions.assertEquals(0, queue.size());
    assertNull(queue.peek());
    assertNull(queue.dequeue());
  }

  @Test
  public void enqueue_one() {
    queue.enqueue(5);

    Assertions.assertFalse(queue.isEmpty());
    Assertions.assertEquals(1, queue.size());
    Assertions.assertEquals(5, queue.peek());
  }

  @Test
  public void dequeue_one() {
    queue.enqueue(12);
    Object result = queue.dequeue();

    Assertions.assertTrue(queue.isEmpty());
    assertEquals(12, result);
    assertNull(queue.peek());
  }

  @Test
  public void enqueue_two() {
    queue.enqueue(8);
    queue.enqueue(11);

    Assertions.assertEquals(8, queue.peep());
    Assertions.assertEquals(2, queue.size());
  }

  @Test
  public void enqueue_three() {
    queue.enqueue(3);
    queue.enqueue(9);
    queue.enqueue(7);

    Assertions.assertEquals(3, queue.peep());
    Assertions.assertEquals(3, queue.size());
  }

  @Test
  public void dequeue_three() {
    queue.enqueue(6);
    queue.enqueue(2);
    queue.enqueue(20);

    Assertions.assertEquals(6, queue.dequeue());
    Assertions.assertEquals(2, queue.size());
    Assertions.assertEquals(2, queue.peek());

    Assertions.assertEquals(2, queue.dequeue());
    Assertions.assertEquals(1, queue.size());
    Assertions.assertEquals(20, queue.peek());

    Assertions.assertEquals(20, queue.dequeue());
    Assertions.assertEquals(0, queue.size());
    assertNull(queue.peek());
  }
}
