package Jun2018;

public class MonkSearch {

  public int searchGreaterThan(int[] array, int greaterThan) {
//    int index = binarySearch(array, greaterThan);

//    return index == -1 ? 0 : array.length - index - 1;

    int count = 0;

    for(int i = 0; i < array.length; i++) {
      if(array[i] > greaterThan) {
        count = array.length - i;
        break;
      }
    }
    return count;
  }

  private int binarySearch(int[] array, int greaterThan) {
    int low = 0;
    int high = array.length;
    int middle;

    while(low < high) {
      middle = (low+high) / 2;

      if(array[middle] < greaterThan) {
        low = high + 1;
      }
      else if(array[middle] > greaterThan) {
        high = middle - 1;
      }
      else {
        return middle;
      }
    }
    return -1;
  }

  public int searchNotLessThan(int[] array, int notLessThan) {
//    int index = binarySearch(array, notLessThan);
//
//    return index == -1 ? 0 : array.length - index;
    int count = 0;

    for (int i = 0; i < array.length; i++) {
      if(array[i] >= notLessThan) {
        count = array.length - i;
        break;
      }
    }

    return count;
  }
}
