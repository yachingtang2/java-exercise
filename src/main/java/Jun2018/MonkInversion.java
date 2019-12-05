package Jun2018;

public class MonkInversion {

  public int count(int[][] array) {
    int inversionCount = 0;

    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j < array.length; j++) {
        inversionCount += countInversionXY(i, j, array);
      }
    }

    return inversionCount;
  }

  public int countInversionXY(int x, int y, int[][] array) {
    int inversionCount = 0;
    for(int i = x; i < array.length; i++) {
      for(int j = y; j < array.length; j++) {
//        System.out.println("1. array["+ x + "][" + y + "] = " + array[x][y] + ", array["+ i + "][" + j + "] = " + array[i][j]);
        if(array[x][y] > array[i][j]) {
          inversionCount++;
//          System.out.println("inversionCount = " + inversionCount);
        }
      }
    }
    return inversionCount;
  }
}
