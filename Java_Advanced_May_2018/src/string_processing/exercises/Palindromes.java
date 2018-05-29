package string_processing.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] words = reader.readLine().split("[ ,.?!]+");
    Set<String> palindromes = new TreeSet<>();
  
    for (String word : words) {
      
      if (isPalindorm(word)) {
        palindromes.add(word);
      }
    }
    System.out.println(palindromes.toString());
  }
  
  private static boolean isPalindorm(String word) {
    boolean isPalindrome = true;
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
        isPalindrome = false;
      }
    }
    return isPalindrome;
  }
}
