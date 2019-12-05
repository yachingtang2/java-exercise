package Jun2018;

import java.util.*;

public class BobIdiot {

  public String swapBack(String string, String[] swapped) {
    List<Character> stringList = populateList(string);
    for(int i = 0; i < swapped.length; i++) {

      Map<Character, Character> map = getMap(swapped, i);

      stringList = swapCharacters(stringList, map);
    }
    return convertListToString(stringList);
  }

  private String convertListToString(List<Character> stringList) {
    StringBuilder builder = new StringBuilder();
    for(Character ch : stringList) {
      builder.append(ch);
    }
    return builder.toString();
  }

  private List<Character> swapCharacters(List<Character> stringList, Map<Character, Character> map) {
    List<Character> currentStringList = stringList;
    for(Character ch : map.keySet()) {
      int index1 = findIndex(currentStringList, map, ch);
      if(index1 >= 0) {
        currentStringList.set(index1, ch);
      }
      int index2 = currentStringList.indexOf(ch);
      if(index2 >= 0) {
        currentStringList.set(index2, map.get(ch));
      }
    }
    return currentStringList;
  }

  private int findIndex(List<Character> currentStringList, Map<Character, Character> map, Character ch) {
    char lower = map.get(ch).toString().toLowerCase().charAt(0);
    char upper = map.get(ch).toString().toUpperCase().charAt(0);
    int index1 = currentStringList.indexOf(lower);
    int index2 = currentStringList.indexOf(upper);
    int index = 0;

    if(index1 >= 0 && index2 >= 0) {
      if(index1 <= index2) {
        index = index1;
      }
      else if(index2 < index1) {
        index = index2;
      }
    }
    else if(index1 >= 0 && index2 < 0) {
      index = index1;
    }
    else if(index2 >= 0 && index1 < 0) {
      index = index2;
    }

    return index;
  }

  private List<Character> populateList(String string) {
    List<Character> stringList = new ArrayList<>();
    char[] array = string.toCharArray();

    for(int i = 0; i < array.length; i++) {
      stringList.add(array[i]);
    }
    return stringList;
  }

  private Map<Character, Character> getMap(String[] swapped, int i) {
    Map<Character, Character> map = new LinkedHashMap<>();
    String[] array = swapped[i].split(" ");
    map.put(array[0].charAt(0), array[1].charAt(0));
    return map;
  }
}
