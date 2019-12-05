package Jun2018;

public class RotatedSortedArraySearch {
  public int searchSmallestNumberIndex(int[] array) {
    int originalMedium = array.length / 2;
    int medium = originalMedium;
    int smallestNumberIndex = -1;

    while (medium >= 1) {
      if (array[medium-1] > array[medium]) {
        smallestNumberIndex = medium;
        break;
      }
      else {
        medium = medium / 2;
      }
    }
    if (smallestNumberIndex == -1) {
      medium = originalMedium;
      while(medium < array.length-1) {
        if (array[medium] > array[medium+1]) {
          smallestNumberIndex = medium + 1;
          break;
        } else {
          medium = (array.length + medium) / 2;
        }
      }
    }
    return smallestNumberIndex == -1 ? 0 : smallestNumberIndex;
  }
}
