package Jun2018;

public class ToggleString {

  public String toggle(String stringToToggle) {
    StringBuilder stringBuilder = new StringBuilder();

    for(int i = 0; i < stringToToggle.length(); i++) {
      char character = stringToToggle.charAt(i);

      if(character >= 97) {
        stringBuilder.append(Character.toString(character).toUpperCase());
      }
      else {
        stringBuilder.append(Character.toString(character).toLowerCase());
      }
    }

    return stringBuilder.toString();
  }
}
