package Jun2018;

public class MinimumSwaps2 {
  public int count(int[] array) {
    int swaps = 0;
    for(int i = 0; i < array.length; i++) {
      if(array[i] != (i+1)) {
        for(int j = i; j < array.length; j++) {
          int temp;
          if(array[j] == (i+1)) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            swaps++;
            break;
          }
        }
      }
    }
    return swaps;
  }
}
