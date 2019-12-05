package Jun2018;

public class PlayingWithNumbers {
  public long calculateMean(int[] array, int fromIndex, int toIndex) {

    int sum = 0;
    if (fromIndex-1 > 0) {
      sum = array[toIndex-1] - array[fromIndex-1-1];
    }
    else {
      sum = array[toIndex-1];
    }

    return (long) Math.floor(sum/(toIndex-fromIndex+1));
  }
}
