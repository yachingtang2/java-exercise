package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class TreeTraversalTest {
  private Node node1;

  @BeforeEach
  void setUp() {

    node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    node1.left = node2;
    node1.right = node3;
    node2.left = node4;
    node2.right = node5;
  }

  @Test
  void inOrderTraversal() {
    InOrderTraversal inOrderTraversal = new InOrderTraversal();
    List<Integer> result = inOrderTraversal.traverse(node1);
    assertThat(result, contains(4, 2, 5, 1, 3));
  }

  @Test
  void preOrderTraversal() {
    PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
    List<Integer> result = preOrderTraversal.traverse(node1);
    assertThat(result, contains(1, 2, 4, 5, 3));
  }

  @Test
  void postOrderTraversal() {
    PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
    List<Integer> result = postOrderTraversal.traverse(node1);
    assertThat(result, contains(4, 5, 2, 3, 1));
  }

  @Test
  void BreadthFirstTraversal() {
    BreadthFirstTraversal breadthFirstTraversal = new BreadthFirstTraversal();
    List<Integer> result = breadthFirstTraversal.traverse(node1);
    assertThat(result, contains(1, 2, 3, 4, 5));
  }

  @Test
  void DepthFirstTraversal() {
    DepthFirstTraversal depthFirstTraversal = new DepthFirstTraversal();
    List<Integer> result = depthFirstTraversal.traversal(node1);
    assertThat(result, contains(1, 2, 4, 5, 3));
  }
}
