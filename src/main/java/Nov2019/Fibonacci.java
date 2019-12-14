package Nov2019;

class Fibonacci {
  int generate(int nth) {
    if(nth <= 1) {
      return 1;
    }

    return generate(nth - 1) + generate(nth - 2);

//    if(nth < 3) {
//      return 1;
//    }
//
//    return generate(nth - 2) + generate(nth - 1);

//    System.out.println("YCT - " + nth);
//    if (nth == 0) {
//      return 0;
//    }
//    if (nth == 1 || nth == 2) {
//        return 1;
//    }
//    return generate(nth - 2) + generate(nth - 1);
  }


  public boolean isFibonacci(int number) {
    if(number == 1) {
      return true;
    }

    for(int i = 2; i < 100; i++) {
      int generatedNumber = generate(i);
      System.out.println("YCT - " + generatedNumber);
      if(generatedNumber == number) {
        return true;
      } else if(generatedNumber > number) {
        break;
      }
    }
    return false;

//    return isPerfectSquare(5 * number * number + 4) ||
//        isPerfectSquare(5 * number * number - 1);

  }

  private boolean isPerfectSquare(int number) {
    int squareRoot = (int) Math.sqrt(number);

    return number == squareRoot * squareRoot;
  }
}
