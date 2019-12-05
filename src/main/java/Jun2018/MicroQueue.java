package Jun2018;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MicroQueue {

  private Queue<Integer> queue = new LinkedList<>();

  private List<Integer> removedElements = new ArrayList<>();

  public int operate(String operation) {
    String[] operations = operation.split(" ");

    switch (operations[0]) {
      case "E":
        enqueueOperation(operations);
        break;
      case "D":
        dequeueOperation();
        break;
    }
    return queue.size();
  }

  private void dequeueOperation() {
    if(queue.size() > 0) {
      int removedElement = (int) ((LinkedList) queue).getFirst();
      queue.remove();
      removedElements.add(removedElement);
    }
    else {
      removedElements.add(-1);
    }
  }

  private void enqueueOperation(String[] operations) {
    queue.add(Integer.parseInt(operations[1]));
  }

  public List<Integer> getRemovedElements() {
    return removedElements;
  }
}
