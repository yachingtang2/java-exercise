package Jun2018;

public class ShiftArrayLeft {
  public int[] shift(int[] array, int position) {
    int simplifiedPosition = position % array.length;
    int[] movedToTheBack = new int[simplifiedPosition];
    int[] shiftedArray = new int[array.length];

    for(int i = 0; i < simplifiedPosition; i++) {
      movedToTheBack[i] = array[i];  // i = 0, movedToTheBack[0] = 10, i = 1, movedToTheBack[1] = 20,
    }

    for(int i = 0; i < array.length-simplifiedPosition; i++) {
      shiftedArray[i] = array[i+simplifiedPosition];  //0 => 1, 1 => 2, 2 => 3, 3 => 4
    }

    for(int i = array.length-simplifiedPosition, j = 0; i < array.length; i++, j++) {
      shiftedArray[i] = movedToTheBack[j];
    }
    return shiftedArray;
  }
}
