package Jun2018;

public class BubbleSort {
  public static int swapCount = 0;

  public static void resetSwapCount() {
    swapCount = 0;
  }

  public static int sort(int[] array, int length) {
    if(length == 1) {
      return swapCount;
    }
    for(int i = 0; i < length - 1; i++) {
      if(array[i] > array[i+1]) {
        int currentNumberAtIndex = array[i];
        array[i] = array[i+1];
        array[i+1] = currentNumberAtIndex;
        ++swapCount;
      }
    }
    sort(array, length - 1);
    return swapCount;
  }

//  public int sort(int[] array) {
//    int swapCount = 0;
//
//    for(int i = 0; i < array.length - 1; i++) {
//      for(int j = 0; j < array.length - 1 - i; j++) {
//        System.out.println(j + ", " + (j+1) + ", " + array[j] + ", " + array[j+1]);
//
//        if(array[j] > array[j+1]) {
//          int currentNumberAtIndex = array[j];
//          array[j] = array[j+1];
//          array[j+1] = currentNumberAtIndex;
//          ++swapCount;
//        }
//      }
//
//      // This is wrong
////      for(int j = i + 1; j < array.length; j++) {
//////        System.out.println(array[i] + ", " + array[j]);
////        if(array[i] > array[j]) {
////          int currentNumberAtIndex = array[i];
////          array[i] = array[j];
////          array[j] = currentNumberAtIndex;
////          ++swapCount;
////        }
////      }
//    }
//    for(int number : array) {
//      System.out.println(number);
//    }
//
//    return swapCount;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////    int temporaryNumber;
////    int swapCount = 0;
////
////    for(int i = 0; i < arraySize - 1; i++) {
////      for(int j = 0; j < arraySize - i - 1; j++) {
////        System.out.println("array[" + j + "] = " + array[j] + ", array[" + (j+1) + "] = " + array[j+1]);
////        if(array[j] > array[j+1]) {
////          temporaryNumber = array[j];
////          array[j] = array[j+1];
////          array[j+1] = temporaryNumber;
////          swapCount++;
////        }
////      }
////    }
////    return swapCount;
//  }
}
