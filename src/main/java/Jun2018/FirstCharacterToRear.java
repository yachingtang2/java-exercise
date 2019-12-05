package Jun2018;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstCharacterToRear {
  public String move(String string) {
    Character chToRemove;
    char[] array = string.toCharArray();
    List<Character> charList = new LinkedList<>();

    for(int i = 0; i < array.length; i++) {
      charList.add(array[i]);
    }
    chToRemove = (Character) ((LinkedList<Character>) charList).getFirst();
    ((LinkedList<Character>) charList).remove();
    ((LinkedList) charList).addLast(chToRemove);

    String newString = new String();
    Iterator iterator = charList.iterator();
    while(iterator.hasNext()) {
      newString += ((Character) iterator.next()).toString();
    }
    return newString;
  }
}
