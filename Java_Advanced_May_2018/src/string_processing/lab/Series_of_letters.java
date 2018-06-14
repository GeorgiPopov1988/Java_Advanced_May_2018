package string_processing.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Series_of_letters {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String input = reader.readLine();
    char[] letters = input.toCharArray();
  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(letters[0]);
    
    for (int i = 0; i < letters.length - 1; i++) {
      if (letters[i] != letters[i + 1]) {
        stringBuilder.append(letters[i + 1]);
      }
    }
  
    System.out.println(stringBuilder.toString());
  }
}
