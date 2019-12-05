package Jun2018;

public class NiceArches {

  public int countArches(String[] array) {
    int count = 0;
    for(int i = 0; i < array.length; i++) {
      if(hasOddTotalLetter(array[i].toCharArray(), 'A') || hasOddTotalLetter(array[i].toCharArray(), 'B')) {
        continue;
      }
      if(isBubblyWord(array[i])) {
        count++;
      }
    }
    return count;
  }

  private boolean hasOddTotalLetter(char[] array, char character) {
    int count = 0;
    for(int i = 0; i < array.length; i++) {
      if(array[i] == character) {
        count++;
      }
    }
    if(count % 2 == 0) {
      return false;
    }
    return true;
  }

  public boolean isBubblyWord(String string) {
    char[] charArray = string.toCharArray();
    boolean isBubbly = true;
    boolean needAnotherA = false;
    boolean needAnotherB = false;
    int aPairIndexSum = 0;
    int bPairIndexSum = 0;

    for(int i = 0; i < charArray.length; i++) {
      if(!needAnotherA && charArray[i] == 'A') {
        aPairIndexSum = 0;
        needAnotherA = true;
        aPairIndexSum += i;
      }
      else if(needAnotherA && charArray[i] == 'A') {
        aPairIndexSum += i;
        needAnotherA = false;
      }
      if(!needAnotherB && charArray[i] == 'B') {
        bPairIndexSum = 0;
        needAnotherB = true;
        bPairIndexSum += i;
      }
      else if(needAnotherB && charArray[i] == 'B') {
        bPairIndexSum += i;
        needAnotherB = false;
      }

      if((!needAnotherA && aPairIndexSum > 0 && aPairIndexSum % 2 == 0) ||
          (!needAnotherB && bPairIndexSum > 0 && bPairIndexSum % 2 == 0)) {
        isBubbly = false;
      }
    }

    if(needAnotherA || needAnotherB) {
      isBubbly = false;
    }
    return isBubbly;
  }
}
