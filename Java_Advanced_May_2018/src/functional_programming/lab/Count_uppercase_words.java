package functional_programming.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Count_uppercase_words {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    List<String> text = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toList());
    List<String> words = new LinkedList<>();
  
    checkWords(text, words);
    printResult(words);
  }
  
  private static void checkWords(List<String> text, List<String> words) {
    Predicate<String> checkForUppercaseWord = s -> s.charAt(0) == s.toUpperCase().charAt(0);
    for (int i = 0; i < text.size(); i++) {
      if (checkForUppercaseWord.test(text.get(i))) {
        words.add(text.get(i));
      }
    }
  }
  
  private static void printResult(List<String> words) {
    System.out.println(words.size());
    for (String word : words) {
      System.out.println(word);
    }
  }
}
