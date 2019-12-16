package Nov2019;

class ReverseWordsInSentence {
  public String reverse(String sentence) {
    if(sentence == null || sentence.isEmpty()) {
      return sentence;
    }

    String[] words = sentence.split(" ");

    for(int i = 0; i < words.length / 2; i++) {
      String wordToSwap = words[i];
      words[i] = words[words.length - 1 - i];
      words[words.length -1 - i] = wordToSwap;
    }

    StringBuilder stringBuilder = new StringBuilder();

    for(String word : words) {
      stringBuilder.append(word);
      stringBuilder.append(" ");
    }

    return stringBuilder.toString().trim();
































//    String[] sentenceArray = sentence.split(" ");
//    StringBuilder reversedWordsSentence = new StringBuilder();
//
//    for(int i = 0; i < sentenceArray.length / 2; i++) {
//      String currentString = sentenceArray[i];
//      sentenceArray[i] = sentenceArray[sentenceArray.length - 1 - i];
//      sentenceArray[sentenceArray.length - 1 - i] = currentString;
//    }
//
//    for(String string : sentenceArray) {
//      reversedWordsSentence.append(string);
//      reversedWordsSentence.append(" ");
//    }
//    return reversedWordsSentence.toString().strip();



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
