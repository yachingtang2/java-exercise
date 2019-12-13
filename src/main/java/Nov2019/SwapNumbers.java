package Nov2019;

import java.util.ArrayList;
import java.util.List;

class SwapNumbers {
  public List<Integer> swap(int number1, int number2) {
    var swappedNumbers = new ArrayList<Integer>();

    number1 = number1 + number2;
    number2 = number1 - number2;
    number1 = number1 - number2;

    swappedNumbers.add(number1);
    swappedNumbers.add(number2);
    return swappedNumbers;




    //    number1 = number1 + number2;  // 30
//    number2 = number1 - number2;  // 30 - 20 = 10
//    number1 = number1 - number2;  // 30 = 10 = 20
//
//    return List.of(number1, number2);
  }
}
