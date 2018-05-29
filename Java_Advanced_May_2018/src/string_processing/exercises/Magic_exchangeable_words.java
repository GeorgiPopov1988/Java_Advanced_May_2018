package string_processing.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Magic_exchangeable_words {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] words = reader.readLine().split(" ");
    String firstWord = words[0];
    String secondWord = words[1];
    
    System.out.println(isExchangeable(firstWord, secondWord));
  }
  
  private static boolean isExchangeable(String firstWord, String secondWord) {
    Set<Character> one = new HashSet<>();
    Set<Character> second = new HashSet<>();
    for (int i = 0; i < firstWord.length(); i++) {
      one.add(firstWord.charAt(i));
    }
  
    for (int i = 0; i < secondWord.length(); i++) {
      second.add(secondWord.charAt(i));
    }
    if (one.size() == second.size()) {
      return true;
    } else {
      return false;
    }
  }
}
