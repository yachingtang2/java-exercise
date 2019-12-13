package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class TreeTraversalTest {
  private Node root;

  @BeforeEach
  void setUp() {
    root = new Node('F');
    Node nodeA = new Node('A');
    Node nodeB = new Node('B');
    Node nodeC = new Node('C');
    Node nodeD = new Node('D');
    Node nodeE = new Node('E');
    Node nodeG = new Node('G');
    Node nodeH = new Node('H');
    Node nodeI = new Node('I');
    root.left = nodeB;
    root.right = nodeG;
    nodeB.left = nodeA;
    nodeB.right = nodeD;
    nodeD.left = nodeC;
    nodeD.right = nodeE;
    nodeG.right = nodeI;
    nodeI.left = nodeH;
  }

  @Test
  void preOrderTraversal() {
    PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
    assertThat(preOrderTraversal.traverse(root), contains('F', 'B', 'A', 'D', 'C', 'E', 'G', 'I', 'H'));
  }

  @Test
  void inOrderTraversal() {
    InOrderTraversal inOrderTraversal = new InOrderTraversal();
    assertThat(inOrderTraversal.traverse(root), contains('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'));
  }

  @Test
  void postOrderTraversal() {
    PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
    assertThat(postOrderTraversal.traverse(root), contains('A', 'C', 'E', 'D', 'B', 'H', 'I', 'G', 'F'));
  }

  @Test
  void breadthFirstTraversal() {
    BreadthFirstTraversal breadthFirstTraversal = new BreadthFirstTraversal();
    assertThat(breadthFirstTraversal.traverse(root), contains('F', 'B', 'G', 'A', 'D', 'I', 'C', 'E', 'H'));
  }

  @Test
  void depthFirstTraversal() {
    DepthFirstTraversal depthFirstTraversal = new DepthFirstTraversal();
    assertThat(depthFirstTraversal.traverse(root), contains('F', 'B', 'A', 'D', 'C', 'E', 'G', 'I', 'H'));
  }

//  private Node node1;
//
//  @BeforeEach
//  void setUp() {
//
//    node1 = new Node(1);
//    Node node2 = new Node(2);
//    Node node3 = new Node(3);
//    Node node4 = new Node(4);
//    Node node5 = new Node(5);
//    node1.left = node2;
//    node1.right = node3;
//    node2.left = node4;
//    node2.right = node5;
//  }
//
//  @Test
//  void inOrderTraversal() {
//    InOrderTraversal inOrderTraversal = new InOrderTraversal();
//    List<Integer> result = inOrderTraversal.traverse(node1);
//    assertThat(result, contains(4, 2, 5, 1, 3));
//  }
//
//  @Test
//  void preOrderTraversal() {
//    PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
//    List<Integer> result = preOrderTraversal.traverse(node1);
//    assertThat(result, contains(1, 2, 4, 5, 3));
//  }
//
//  @Test
//  void postOrderTraversal() {
//    PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
//    List<Integer> result = postOrderTraversal.traverse(node1);
//    assertThat(result, contains(4, 5, 2, 3, 1));
//  }
//
//  @Test
//  void BreadthFirstTraversal() {
//    BreadthFirstTraversal breadthFirstTraversal = new BreadthFirstTraversal();
//    List<Integer> result = breadthFirstTraversal.traverse(node1);
//    assertThat(result, contains(1, 2, 3, 4, 5));
//  }
//
//  @Test
//  void DepthFirstTraversal() {
//    DepthFirstTraversal depthFirstTraversal = new DepthFirstTraversal();
//    List<Integer> result = depthFirstTraversal.traversal(node1);
//    assertThat(result, contains(1, 2, 4, 5, 3));
//  }
}
