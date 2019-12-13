package Nov2019;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class InOrderTraversal {
  private static List<Character> characters = new ArrayList<>();

  public List<Character> traverse(Node root) {
    if(root.left != null) {
      traverse(root.left);
    }

    characters.add(root.value);

    if(root.right != null) {
      traverse(root.right);
    }
    return characters;
  }

//  private static List<Integer> inOrderTraversal = new ArrayList<>();
//
//  List<Integer> traverse(Node node) {
//    if(node.left != null) {
//      traverse(node.left);
//    }
//
//    inOrderTraversal.add(node.value);
//
//    if(node.right != null) {
//      traverse(node.right);
//    }
//    return inOrderTraversal;
//  }
}

class PreOrderTraversal {
  public static List<Character> characters = new ArrayList<>();

  public List<Character> traverse(Node root) {

    characters.add(root.value);

    if(root.left != null) {
      traverse(root.left);
    }

    if(root.right != null) {
      traverse(root.right);
    }

    return characters;
  }


//  private static List<Integer> preOrderTraversal = new ArrayList<>();
//
//  List<Integer> traverse(Node node) {
//    preOrderTraversal.add(node.value);
//
//    if(node.left != null) {
//      traverse(node.left);
//    }
//
//    if(node.right != null) {
//      traverse(node.right);
//    }
//
//    return preOrderTraversal;
//  }
}

class PostOrderTraversal {
  private static List<Character> characters = new ArrayList<>();

  public List<Character> traverse(Node root) {
    if(root.left != null) {
      traverse(root.left);
    }

    if(root.right != null) {
      traverse(root.right);
    }

    characters.add(root.value);

    return characters;
  }

//  List<Integer> traverse(Node node) {
//    if(node.left != null) {
//      traverse(node.left);
//    }
//
//    if(node.right != null) {
//      traverse(node.right);
//    }
//
//    postOrderTraversal.add(node.value);
//    return postOrderTraversal;
//  }
}

// Also known as "Level Order" traversal
class BreadthFirstTraversal {
  private static List<Character> characters = new ArrayList<>();

  public List<Character> traverse(Node root) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()) {
      Node node = queue.poll();
      characters.add(node.value);

      if(node.left != null) {
        queue.add(node.left);
      }

      if(node.right != null) {
        queue.add(node.right);
      }
    }

    return characters;
  }

//  List<Character> traverse(Node node) {
//    Queue<Node> queue = new LinkedList<>();
//    queue.add(node);
//
//    while(!queue.isEmpty()) {
//      Node firstNode = queue.poll();
//      characters.add(firstNode.value);
//      if (firstNode.left != null) {
//        queue.add(firstNode.left);
//      }
//      if (firstNode.right != null) {
//        queue.add(firstNode.right);
//      }
//    }
//    return characters;
//  }
}

// Similar to Pre-order
class DepthFirstTraversal {
  private static List<Character> characters = new ArrayList<>();

  public List<Character> traverse(Node root) {
    java.util.Stack<Node> stack = new java.util.Stack<>();
    stack.push(root);

    while(!stack.isEmpty()) {
      Node node = stack.pop();
      characters.add(node.value);

      if(node.right != null) {
        stack.push(node.right);
      }
      if(node.left != null) {
        stack.push(node.left);
      }
    }

    return characters;
  }


//  List<Integer> traversal(Node node) {
//    java.util.Stack<Node> stack = new java.util.Stack<>();
//
//    stack.push(node);
//
//    while(!stack.isEmpty()) {
//      Node topNode = stack.pop();
//      depthFirstTraversal.add(topNode.value);
//      System.out.println("YCT - " + depthFirstTraversal);
//      if(topNode.right != null) {
//        stack.push(topNode.right);
//      }
//
//      if(topNode.left != null) {
//        stack.push(topNode.left);
//      }
//    }
//
//    return depthFirstTraversal;
//  }
}
