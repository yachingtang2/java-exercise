package Jun2018;

public class GSInterview {
  public static void main(String[] args) {
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {2,5,3,1,4,6};
    boolean elementEqual = false;

    if(array1.length == array2.length) {
      int[] sortedArray1 = bubbleSort(array1);
      int[] sortedArray2 = bubbleSort(array2);

      for(int i = 0; i < sortedArray1.length; i++) {
        if(sortedArray1[i] != sortedArray2[i]) {
          elementEqual = false;
          break;
        }
        else {
          elementEqual = true;
        }
      }

    }

    System.out.println("Arrays Equal = " + elementEqual);

  }

  public static int[] bubbleSort(int[] arrayInput) {
    int[] array = arrayInput;
    for(int i = 0; i < array.length - 1; i++) {
      for(int j = 0; j < array.length - i - 1; j++) {
        if(array[j] > array[j+1]) {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
    return array;
  }
}
