package Nov2019;

class ArrayRotation {
  int[] rotateLeft(int[] array, int rotation) {
    if(rotation == 0 || rotation % array.length == 0) {
      return array;
    }

    int actualRotation = rotation % array.length;

    int[] rotatedArray = new int[array.length];

    for(int i = 0; i < array.length; i++) {
      if(i - actualRotation < 0) {
        rotatedArray[array.length - actualRotation + i] = array[i];
      } else {
        rotatedArray[i-actualRotation] = array[i];
      }
    }

    return rotatedArray;
  }

  public int[] rotateRight(int[] array, int rotation) {
    int actualRotation = rotation % array.length;

    if(actualRotation == 0) {
      return array;
    }

    int[] rotatedArray = new int[array.length];

    for(int i = 0; i < array.length; i++) {
      rotatedArray[(i+actualRotation) % array.length] = array[i];
    }

    return rotatedArray;
  }
}
