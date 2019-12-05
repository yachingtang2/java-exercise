package Jun2018;

public class FindDuplicatesInArray {
  public int[] findDuplicate(int[] array) {
    int[] duplicates = new int[array.length];
    int count = 0;
    boolean noDuplicate = true;

    for(int i = 0; i < array.length - 1; i++) {
      for(int j = 1; j < array.length; j++) {
        if(i != j && array[i] == array[j] && !isExistingDuplicate(duplicates, array[i])) {
          duplicates[count++] = array[i];
          noDuplicate = false;
        }
      }
    }

    if(noDuplicate) {
      duplicates[0] = -1;
    }

    return duplicates;
  }

  public boolean isExistingDuplicate(int[] array, int value) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == value) {
        return true;
      }
    }
    return false;
  }
}
