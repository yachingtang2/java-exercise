package Jun2018;

public class ParenthesesStack {
  public boolean isBalanced(String string) {
    Stack stack = new Stack();

    char[] chars = string.toCharArray();

    for(int i = 0; i < chars.length; i++) {
      switch (chars[i]) {
        case '[' :
        case '(' :
        case '{' :
          stack.push(chars[i]);
          break;
        case ']' :
          if (stack.peep() == (Object) '[') {
            stack.pop();
          }
          break;
        case ')' :
          if (stack.peep() == (Object) '(') {
            stack.pop();
          }
          break;
        case '}' :
          if (stack.peep() == (Object) '{') {
            stack.pop();
          }
          break;
        default:
          break;
      }
    }
    return stack.isEmpty();
  }
}
