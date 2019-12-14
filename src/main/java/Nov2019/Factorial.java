package Nov2019;

class Factorial {

  int generate(int number) {
    if(number == 1) {
      return number;
    }
    return number * generate(number - 1);



























//    return number == 1 ? 1 : number * generate(number - 1);
  }









//  int generate(int number) {
//    return number == 1 ? 1 : number * generate(number - 1);
//  }
}


//    System.out.println("YCT - " + number);
//    if (number == 1 || number == 0) {
//      return 1;
//    }
//    return number * generate(number - 1) ;
//  }