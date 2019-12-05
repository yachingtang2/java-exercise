package Jun2018;

public class BinarySearch {
  public int search(int[] array, int numberToSearch) {
    int low = 0;
    int high = array.length-1;
    int middle = 0;
    int index = -1;

    while(low <= high) {
      middle = (low + (high+1)) / 2;

      if(numberToSearch < array[middle]) {
        high = middle-1;
      } else if (numberToSearch > array[middle]) {
        low = middle+1;
      } else if (numberToSearch == array[middle]) {
        index = middle;
      }

      if (index != -1) {
        break;
      }
    }

    return index;
    // low = 0, high = 4, middle = (0+4)/2 = 2, 2 < 6 => high = 2-1=1
    // low = 0, high = 1, middle = (0+1)/2 = 0, 2 = 0 =>
  }
}
