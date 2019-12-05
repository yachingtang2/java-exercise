package Jun2018;

public class MinimumBribe {
//  public int count(int[] array) {
//    int minimumBribeCounts = 0;
//
//    for(int i = 0; i < array.length - 1; i++) {
//      if(array[i] - array[i+1] > 2) {
//        minimumBribeCounts = -1;
//        break;
//      }
//      if(array[i] > array[i+1]) {
//        minimumBribeCounts += array[i] - array[i+1];
//      }
//    }
//    return minimumBribeCounts;
//  }

//  public int count(int[] array) {
//    int[] numberArray = new int[array.length];
//    int temp;
//    int totalSwaps = 0;
//    for(int i = 0; i < array.length; i++) {
//      for(int j = 0; j < array.length-1; j++) {
////        System.out.println("Before: " + array[j] + ", " + array[j+1]);
//        if(array[j] > array[j+1]) {
//          if(numberArray[array[j]-1]+1 > 2) {
//            totalSwaps = -1;
//            break;
//          }
//          else {
//            numberArray[array[j]-1]++;
//          }
////          System.out.println("Comparison: numberArray[" + numberArray[array[j]-1] + "] = " + numberArray[array[j]-1]);
//          temp = array[j+1];
//          array[j+1] = array[j];
//          array[j] = temp;
////          System.out.println("After: " + array[j] + ", " + array[j+1]);
//          totalSwaps++;
//        }
//      }
//      if(totalSwaps == -1) {
//        break;
//      }
//    }
//
////    for(int i = 0; i < array.length; i++) {
////      System.out.print(array[i] + ", ");
////    }
////    System.out.println(" ");
////    for(int i = 0; i < array.length; i++) {
////      System.out.print(numberArray[i] + ", ");
////    }
////    System.out.println("totalSwaps = " + totalSwaps);
//    return totalSwaps;
//  }

  public int count(int[] q) {
    int bribe = 0;
    boolean chaotic = false;
    System.out.println("Test Case.....");
    for(int i = 0; i < q.length; i++)
    {
      System.out.println("1. q[" + i + "] = " + q[i] + ", i+1 = " + (i+1));
      if(q[i]-(i+1) > 2)
      {
        System.out.println("2. q[" + i + "] = " + q[i] + ", i+1 = " + i+1 + ", diff > 2 - Too chaotic");
        chaotic = true;
        break;
      }
      for (int j = Math.max(0, q[i]-1-1); j < i; j++) {
        System.out.print("3. i = "+ i + ", j = " + j + ", q[" + i + "] = " + q[i]);
        System.out.print(", q[i]-1-1 = ");
        System.out.println(q[i]-1-1);
        if (q[j] > q[i]) {
          System.out.println("4. q[" + j + "] = " + q[j] + ", q[" + i + "] = " + q[i]);
          bribe++;
        }
      }
    }
    return chaotic ? -1 : bribe;
  }
}
