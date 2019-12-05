package Jun2018;

public class MissingNumberInArray {
  public int findMissingNumber(int[] array) {
    int actualTotal = 0;
    int expectedTotal = 0;

    for(int i = 0; i < array.length; i++) {
      actualTotal += array[i];
    }

    for(int i = 1; i <= 5; i++) {
      expectedTotal += i;
    }

    return expectedTotal - actualTotal;
  }
}
