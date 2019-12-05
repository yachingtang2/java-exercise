package Jun2018;

public class RotateArray {

  public static void main(String[] args) {
    int[] array = { 1,2,3,4,5 };

    int k = 3;  // { 4,5,1,2,3 }

    int[] oldArray = new int[k];

    for(int i = 0; i < k; i++) {
      oldArray[i] = array[i];
    }

//    array[0] => array[2];
//    array[1] => array[3];
//    array[2] => array[4];
//    array[3] => array[0];
//    array[4] => array[1];

    for(int i = 0; i < array.length - k; i++) {
//      int temp = array[i+k-1];
      array[i] = array[i+k];
    }

    int oldArrayIndex = 2;
    for(int i = array.length -1; i >= k-1; i--) {
      array[i] = oldArray[oldArrayIndex];
      oldArrayIndex--;
    }

    System.out.println("array = " + array);
  }
}
