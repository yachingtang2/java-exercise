package Jun2018;

public class LeftRotation {
  public int[] rotate(int[] a, int d) {
    int[] rotatedArray = new int[a.length];
    for(int i = 0; i < a.length; i++) {
      rotatedArray[i] = 0;
    }
    int rotations = d % a.length;

    for(int i = 0; i < a.length; i++) {
      if(i - rotations < 0) {
        rotatedArray[a.length+i-rotations] = a[i];
      }
      else {
        rotatedArray[i-rotations] = a[i];
      }
    }
    return rotatedArray;
  }
}
