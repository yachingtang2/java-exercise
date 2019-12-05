package Nov2019;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class InOrderTraversal {
  private static List<Integer> inOrderTraversal = new ArrayList<>();

  List<Integer> traverse(Node node) {
    if(node.left != null) {
      traverse(node.left);
    }

    inOrderTraversal.add(node.value);

    if(node.right != null) {
      traverse(node.right);
    }
    return inOrderTraversal;
  }
}

class PreOrderTraversal {
  private static List<Integer> preOrderTraversal = new ArrayList<>();

  List<Integer> traverse(Node node) {
    preOrderTraversal.add(node.value);

    if(node.left != null) {
      traverse(node.left);
    }

    if(node.right != null) {
      traverse(node.right);
    }

    return preOrderTraversal;
  }
}

class PostOrderTraversal {
  private static List<Integer> postOrderTraversal = new ArrayList<>();

  List<Integer> traverse(Node node) {
    if(node.left != null) {
      traverse(node.left);
    }

    if(node.right != null) {
      traverse(node.right);
    }

    postOrderTraversal.add(node.value);
    return postOrderTraversal;
  }
}

// Also known as "Level Order" traversal
class BreadthFirstTraversal {
  private static List<Integer> breadthFirstTraversal = new ArrayList<>();

  List<Integer> traverse(Node node) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);

    while(!queue.isEmpty()) {
      Node firstNode = queue.poll();
      breadthFirstTraversal.add(firstNode.value);
      if (firstNode.left != null) {
        queue.add(firstNode.left);
      }
      if (firstNode.right != null) {
        queue.add(firstNode.right);
      }
    }
    return breadthFirstTraversal;
  }
}

// Similar to Pre-order
class DepthFirstTraversal {
  private static List<Integer> depthFirstTraversal = new ArrayList<>();

  List<Integer> traversal(Node node) {
    java.util.Stack<Node> stack = new java.util.Stack<>();

    stack.push(node);

    while(!stack.isEmpty()) {
      Node topNode = stack.pop();
      depthFirstTraversal.add(topNode.value);
      System.out.println("YCT - " + depthFirstTraversal);
      if(topNode.right != null) {
        stack.push(topNode.right);
      }

      if(topNode.left != null) {
        stack.push(topNode.left);
      }
    }

    return depthFirstTraversal;
  }
}
