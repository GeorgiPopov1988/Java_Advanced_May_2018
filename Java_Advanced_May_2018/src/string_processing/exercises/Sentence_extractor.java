package string_processing.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence_extractor {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String keyWord = reader.readLine();
    String text = reader.readLine();
  
    Pattern getText = Pattern.compile("[A-Z][a-z]+[\\w\\s’–,]+[.!?]");
    Pattern getKeyWords = Pattern.compile("\\b(" + keyWord + ")\\b");
  
    Matcher findSentence = getText.matcher(text);
    while (findSentence.find()) {
      String sentence = findSentence.group();
      
      Matcher findKeyWord = getKeyWords.matcher(sentence);
      if (findKeyWord.find()) {
        System.out.println(sentence);
      }
    }
  }
}
