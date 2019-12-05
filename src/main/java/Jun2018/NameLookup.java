package Jun2018;

import java.util.HashMap;
import java.util.Map;

public class NameLookup {
  public Map<Integer, String> rollsAndNames = new HashMap<>();

  public void add(String[] string) {
    String name = null;

    for(int i = 0; i < string.length; i++) {
      String[] rollNumberAndName = string[i].split(" ");
      if(rollNumberAndName.length > 1) {
         name = rollNumberAndName[1];
      }
      else {
        name = null;
      }
      rollsAndNames.put(Integer.parseInt(rollNumberAndName[0]), name);
    }
  }

  public String lookup(int queryNumber) {
    return rollsAndNames.get(queryNumber);
  }
}
