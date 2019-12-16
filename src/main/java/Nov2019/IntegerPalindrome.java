package Nov2019;

class IntegerPalindrome {
  public boolean isPalindrome(int number) {
    int remainder = 0;
    int digitsLeft = number;
    int reversedNumber = 0;

    while(digitsLeft > 0) {
      remainder = digitsLeft % 10;
      reversedNumber = reversedNumber * 10 + remainder;
      digitsLeft /= 10;
    }

    return reversedNumber == number;
























//    int reversedNumber = 0;
//    int remainder;
//    int dividend = number;
//
//    while(dividend > 0) {
//      remainder = dividend % 10;
//      reversedNumber = remainder + reversedNumber * 10;
//      dividend = dividend / 10;
//    }
//
//    return reversedNumber == number;
  }






















//  boolean isPalindrome(int number) {
//    List<Integer> digits = new ArrayList<>();
//    int numberToEvaluate = number;
//    int currentNumber = 0;
//    int round = 0;
//    int reversedNumber = 0;
//
//    while(numberToEvaluate > 9) {
//      currentNumber = numberToEvaluate % 10;
//      digits.add(currentNumber);
//      numberToEvaluate = numberToEvaluate / 10;
//      round++;
//    }
//
//    digits.add(numberToEvaluate);
//
//    for(int i = 0; i < digits.size(); i++) {
//      int hundreds = 1;
//      for(int j = 0; j < round; j++) {
//        hundreds *= 10;
//      }
//      round--;
//      reversedNumber += digits.get(i) * hundreds;
//    }
//
//    return number == reversedNumber;
//  }


//  boolean isPalindrome(int number) {
//    int numberToReverse = number;
//    int reminder = 0;
//    int reversedNumber = 0;
//
//    while(numberToReverse != 0) {
//      reminder = numberToReverse % 10;
//      reversedNumber = reversedNumber * 10 + reminder;
//      numberToReverse = numberToReverse / 10;
//    }
//
//    return number == reversedNumber;
  }










//  boolean isPalindrome(int number) {
//    int numberToReverse = number;
//    int remainder = 0;
//    int reversedNumber = 0;
//
//    while(numberToReverse != 0) {
//      remainder = numberToReverse % 10;
//      reversedNumber = reversedNumber * 10 + remainder;
//      numberToReverse = numberToReverse / 10;
//    }
//
//    return number == reversedNumber;
//  }
//}


// 128 % 10 = 8
// 128 / 10 = 12
// 12 % 10 = 2
// 12 / 10 = 1
