package Nov2019;

import java.util.ArrayList;
import java.util.List;

public class LeafInTree {
  static List<Integer> leafs = new ArrayList<>();
  public List<Integer> findLeafNode(Node node) {

    if(node.left != null) {
      findLeafNode(node.left);
    }
    if(node.right != null) {
      findLeafNode(node.right);
    }
    if(node.left == null && node.right == null) {
      leafs.add(node.value);
    }

    return leafs;
  }
}
