package Nov2019;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class LeafInTreeTest {
  private Node node1;
  private Node node2;
  private Node node3;
  private Node node4;
  private Node node5;
  private Node node6;
  private LeafInTree leafInTree;
//
//  @BeforeEach
//  void setUp() {
//    leafInTree = new LeafInTree();
//    node1 = new Node(1);
//    node2 = new Node(2);
//    node3 = new Node(3);
//    node4 = new Node(4);
//    node5 = new Node(5);
//    node6 = new Node(6);
//  }
//
//  @Test
//  void oneNode() {
//    LeafInTree.leafs = new ArrayList<>();
//    assertThat(leafInTree.findLeafNode(node1), contains(1));
//  }
//
//  @Test
//  void twoNodes() {
//    LeafInTree.leafs = new ArrayList<>();
//    node1.left = node2;
//    assertThat(leafInTree.findLeafNode(node1), contains(2));
//  }
//
//  @Test
//  void threeNodes() {
//    LeafInTree.leafs = new ArrayList<>();
//    node1.left = node2;
//    node1.right = node3;
//    assertThat(leafInTree.findLeafNode(node1), contains(2,3));
//  }
//
//  @Test
//  void fourNodes() {
//    LeafInTree.leafs = new ArrayList<>();
//    node1.left = node2;
//    node1.right = node3;
//    node3.right = node4;
//    assertThat(leafInTree.findLeafNode(node1), contains(2,4));
//  }
//
//  @Test
//  void fiveNodes() {
//    LeafInTree.leafs = new ArrayList<>();
//    node1.left = node2;
//    node1.right = node3;
//    node3.left = node4;
//    node3.right = node5;
//    assertThat(leafInTree.findLeafNode(node1), contains(2,4,5));
//  }
//
//  @Test
//  void sixNodes() {
//    LeafInTree.leafs = new ArrayList<>();
//    node1.left = node2;
//    node1.right = node3;
//    node2.right = node4;
//    node4.right = node5;
//    node5.right = node6;
//    assertThat(leafInTree.findLeafNode(node1), contains(6,3));
//  }
}
