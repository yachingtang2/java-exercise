package Jun2018;

public class TwoDArray {
  public int hourGlassSum(int[][] arr, int xIndex, int yIndex) {
    int sum = 0;
    int verticalIndex = yIndex;
    for(int i = xIndex; i < xIndex+1; i++) {
      sum = getSum(arr, i, verticalIndex);
    }
    return sum;
  }

  private int getSum(int[][] arr, int x, int y) {
    int sum = 0;
    for(int i = x; i <= x+2; i++) {
      for(int j = y; j <= y+2; j++) {
        if(i == x + 1 && (j == y || j == y+2)) {
          System.out.println("exception = " + i + ", " + j);
          continue;
        }
        else {
          System.out.println(i + ", " + j);
          sum += arr[i][j];
        }
      }
    }
    return sum;
  }
}
