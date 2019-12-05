package Nov2019;

class Fibonacci {
  int generate(int nth) {
    if(nth < 3) {
      return 1;
    }

    return generate(nth - 2) + generate(nth - 1);











//    System.out.println("YCT - " + nth);
//    if (nth == 0) {
//      return 0;
//    }
//    if (nth == 1 || nth == 2) {
//        return 1;
//    }
//    return generate(nth - 2) + generate(nth - 1);
  }
}
