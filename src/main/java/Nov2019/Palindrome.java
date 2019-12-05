package Nov2019;

class Palindrome {
  boolean isPalindrome(String string) {

    for(int i = 0, j = string.length()-1; i < string.length(); i++, j--) {
      if(string.charAt(i) == ' ') {
        ++i;
      }
      if(string.charAt(j) == ' ') {
        --j;
      }
      if(string.toLowerCase().charAt(i) != string.toLowerCase().charAt(j)) {
        return false;
      }
    }
    return true;
  }

//  boolean isPalindrome(String string) {
//    String lowercaseString = string.toLowerCase();
//    String reversedString = reverse(lowercaseString);
//
//    return string.toLowerCase().equals(reversedString);
//  }
//
//  private String reverse(String string) {
//    if(string.isEmpty()) {
//      return "";
//    }
//    return string.charAt(string.length() - 1) +
//        reverse(string.substring(0, string.length() - 1));
//  }
}
