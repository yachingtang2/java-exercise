package Jun2018;

public class BubbleSort {
  public int sort(int[] array, int arraySize) {
    int temporaryNumber;
    int swapCount = 0;

    for(int i = 0; i < arraySize - 1; i++) {
      for(int j = 0; j < arraySize - i - 1; j++) {
        System.out.println("array[" + j + "] = " + array[j] + ", array[" + (j+1) + "] = " + array[j+1]);
        if(array[j] > array[j+1]) {
          temporaryNumber = array[j];
          array[j] = array[j+1];
          array[j+1] = temporaryNumber;
          swapCount++;
        }
      }
    }
    return swapCount;
  }
}
