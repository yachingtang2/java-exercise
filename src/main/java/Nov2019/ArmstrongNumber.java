package Nov2019;

import java.util.ArrayList;
import java.util.List;

class ArmstrongNumber {
  boolean isArmstrongNumber(int number) {
    int numberCopy = number;
    int remainder;
    int sumOfCubeOfDigits = 0;

    while(numberCopy != 0) {
      remainder = numberCopy % 10;
      sumOfCubeOfDigits += remainder * remainder * remainder;
      numberCopy /= 10;
    }

    return number == sumOfCubeOfDigits;
  }

  List<Integer> findArmstrongNumber(int number) {
    var armstrongNumbers = new ArrayList<Integer>();

    for(int i = 0; i <= number; i++) {
      if(isArmstrongNumber(i)) {
        armstrongNumbers.add(i);
      }
    }
    return armstrongNumbers;
  }

  void rawType() {
    List<String> myList = new ArrayList<>();
    List newList = myList;
    newList.add(8);

    List rawList = new ArrayList();
    List<String> intList = rawList;
  }
}
