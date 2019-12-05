package Nov2019;

class ReverseWordsInSentence {
  public String reverse(String sentence) {
    var array = sentence.split(" ");

    for(int i = 0; i < array.length / 2; i++) {
      var currentWord = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = currentWord;
    }
    StringBuilder reversedSentence = new StringBuilder();
    for(String word : array) {
      reversedSentence.append(word);
      reversedSentence.append(" ");
    }
    return reversedSentence.toString().strip();
  }
}
