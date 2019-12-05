package Jun2018;

public class PrintArrayRow {
  public int[][] print(int[][] array) {
    int[][] newArray = new int[array[0].length][array.length];

    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j < array[i].length; j++) {
        newArray[j][i] = array[i][j];
      }
    }
    return newArray;
  }
}
