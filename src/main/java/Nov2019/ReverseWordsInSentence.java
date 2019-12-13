package Nov2019;

class ReverseWordsInSentence {
  public String reverse(String sentence) {
    String[] sentenceArray = sentence.split(" ");
    StringBuilder reversedWordsSentence = new StringBuilder();

    for(int i = 0; i < sentenceArray.length / 2; i++) {
      String currentString = sentenceArray[i];
      sentenceArray[i] = sentenceArray[sentenceArray.length - 1 - i];
      sentenceArray[sentenceArray.length - 1 - i] = currentString;
    }

    for(String string : sentenceArray) {
      reversedWordsSentence.append(string);
      reversedWordsSentence.append(" ");
    }
    return reversedWordsSentence.toString().strip();



//    String[] sentenceArray = sentence.split(" ");
//    StringBuilder reversedWordsSentence = new StringBuilder();
//
//    for(int i = sentenceArray.length-1; i >= 0; i--) {
//      reversedWordsSentence.append(sentenceArray[i]);
//      reversedWordsSentence.append(" ");
//    }
//
//    return reversedWordsSentence.toString().strip();



//    var array = sentence.split(" ");
//
//    for(int i = 0; i < array.length / 2; i++) {
//      var currentWord = array[i];
//      array[i] = array[array.length - 1 - i];
//      array[array.length - 1 - i] = currentWord;
//    }
//    StringBuilder reversedSentence = new StringBuilder();
//    for(String word : array) {
//      reversedSentence.append(word);
//      reversedSentence.append(" ");
//    }
//    return reversedSentence.toString().strip();
  }
}
