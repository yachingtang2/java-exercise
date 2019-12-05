package Jun2018;

public class ReverseArray {
  public int[] reverse(int[] array) {
    int[] reversedArray = new int[array.length];

    for(int i = array.length-1, j = 0; i >= 0; i--, j++) {
      reversedArray[i] = array[j];
    }

    return reversedArray;
  }
}
