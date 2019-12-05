package Jun2018;

import java.util.Stack;

public class NiceArchesStack {

  public int countArches(String[] array) {
    int count = 0;
    for(int i = 0; i < array.length; i++) {
      if(isBubblyWord(array[i])) {
        count++;
      }
    }
    return count;
  }

  public boolean isBubblyWord(String string) {
    char[] charArray = string.toCharArray();
    boolean isBubbly = false;
    Stack stack = new Stack();

    for(int i = 0; i < charArray.length; i++) {
      if(stack.empty()) {
        stack.push(charArray[i]);
      }
      else
      {
        if((charArray[i] == 'A' && (Character) stack.get(stack.size()-1) == 'A') ||
            (charArray[i] == 'B' && (Character) stack.get(stack.size()-1) == 'B')) {
          stack.pop();
        }
        else {
          stack.push(charArray[i]);
        }
      }
    }

    if(stack.empty()) {
      isBubbly = true;
    }
    return isBubbly;
  }
}
