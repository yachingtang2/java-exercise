package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

class QueueTest {
  private Queue queue;

  @BeforeEach
  void setUp() {
    queue = new Queue();
  }

  @Test
  void emptyQueue() {
    assertThat(queue.isEmpty(), is(true));
    assertThat(queue.peep(), nullValue());
    assertThat(queue.deQueue(), nullValue());
  }

  @Test
  void insert1ElementDequeue1() {
    queue.enQueue(1);
    assertThat(queue.peep(), is(1));
    assertThat(queue.deQueue(), is(1));
    assertThat(queue.isEmpty(), is(true));
  }

  @Test
  void insert3ElementsDequeue2() {
    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);
    assertThat(queue.peep(), is(1));
    assertThat(queue.deQueue(), is(1));
    assertThat(queue.isEmpty(), is(false));
    assertThat(queue.peep(), is(2));
    assertThat(queue.deQueue(), is(2));
    assertThat(queue.isEmpty(), is(false));
    assertThat(queue.peep(), is(3));
    assertThat(queue.deQueue(), is(3));
    assertThat(queue.isEmpty(), is(true));
  }
}
