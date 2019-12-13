package Nov2019;

//import java.util.Stack;

class ReverseArray {
  String[] reverse(String[] array) {
    if(array == null || array.length < 2) {
      return array;
    }
    for(int i = 0; i < array.length / 2; i++) {
      String word = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = word;
    }

    return array;








//    String[] reversedArray = new String[array.length];
//    Stack<String> stack = new Stack<>();
//    for(String string : array) {
//      stack.push(string);
//    }
//
//    System.out.println("stack size = " + stack.size());
//    for(int i = 0; i < array.length; i++) {
//      reversedArray[i] = stack.pop();
//    }
//
//    return reversedArray;

//    if (array == null || array.length < 2) {
//      return array;
//    }
//
//    for (int i = 0; i < array.length / 2; i++) {
//      String temp = array[i];
//      array[i] = array[array.length - 1 - i];
//      array[array.length - 1 - i] = temp;
//    }
//    return array;
  }
}
