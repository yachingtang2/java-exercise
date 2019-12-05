package Jun2018;

public class IntegerPalindrome {
  public boolean isPalindrome(int number) {
    int palindrome = number;
    int reverse = 0;

    while(palindrome != 0) {
      int remainder = palindrome % 10;
      reverse = reverse * 10 + remainder;
      palindrome = palindrome / 10;
    }

    int[] numbers = new int[3];
    return number == reverse;
  }
}