package Jun2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MagicSquare {
  public int formingMagicSquare(int[][] numbers) {
    int[][] allSquares =
        { {4,9,2,3,5,7,8,1,6}, {2,9,4,7,5,3,6,1,8}, {8,1,6,3,5,7,4,9,2},
            {6,1,8,7,5,3,2,9,4}, {8,3,4,1,5,9,6,7,2}, {4,3,8,9,5,1,2,7,6},
            {6,7,2,1,5,9,8,3,4}, {2,7,6,9,5,1,4,3,8} };
    int[] oneDArray = {0,0,0,0,0,0,0,0,0};

    int index = 0;
    for(int i = 0; i < numbers.length; i++) {
      for(int j = 0 ; j < numbers[i].length;j++) {
        oneDArray[index++] = numbers[i][j];
      }
    }
    List<Integer> costs = new ArrayList<>();
    int oneSquareCost = 0;
    for(int i = 0; i < allSquares.length; i++) {
      oneSquareCost = 0;
      for(int j = 0; j < allSquares[i].length; j++) {
        oneSquareCost += Math.abs(allSquares[i][j] - oneDArray[j]);
//        costs.add(Math.abs(allSquares[i][j] - oneDArray[j]));
        System.out.println(Math.abs(allSquares[i][j] - oneDArray[j]) + ", " + oneSquareCost);
      }
      costs.add(oneSquareCost);
    }
    Collections.sort(costs);

    return costs.get(0);
  }
}
