package Nov2019;

class ArrayRotation {
  int[] rotate(int[] array, int rotation) {





    int[] rotatedArray = new int[array.length];
    int actualRotation = rotation % array.length;

    if(actualRotation == 0) {
      return array;
    }

    for(int i = 0; i < array.length; i++) {
      if(actualRotation - i > 0) {
        rotatedArray[array.length - actualRotation + i] = array[i];
      }
      else if(actualRotation - i <= 0) {
        rotatedArray[i - actualRotation] = array[i];
      }
    }
    return rotatedArray;




























//    int[] rotatedArray = new int[array.length];
//
//    if(rotation % array.length == 0) {
//      return array;
//    }
//
//    int newIndexAfterRotation;
//
//    for(int i = 0; i < array.length; i++) {
//      newIndexAfterRotation = i;
//
//      if(newIndexAfterRotation - rotation < 0) {
//        newIndexAfterRotation = array.length - rotation + i;
//      } else {
//        newIndexAfterRotation = i - rotation;
//      }
//      rotatedArray[newIndexAfterRotation] = array[i];
//    }
//
//    return rotatedArray;












//    int[] rotatedArray = new int[array.length];
//    int actualRotation = rotation % array.length;
//
//    if (actualRotation == 0) {
//      return array;
//    }
//    int newIndexAfterRotation;
//
//    for(int i = 0; i < array.length; i++) {
//      newIndexAfterRotation = i;
//      if (newIndexAfterRotation - actualRotation < 0) {
//        newIndexAfterRotation = array.length - actualRotation + i;
//      } else {
//        newIndexAfterRotation = i - actualRotation;
//      }
//      rotatedArray[newIndexAfterRotation] = array[i];
//    }
//    return rotatedArray;
  }

















//  public int[] rotate(int[] array, int rotations) {
//    int[] rotatedArray = new int[array.length];
//
//    for(int i = 0; i < array.length; i++) {
//      rotatedArray[(rotations+i) % array.length] = array[i];
//    }
//    return rotatedArray;
//  }
}
