package string_processing.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_substring_occurrences {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    var text = reader.readLine().toUpperCase();
    var pattern = reader.readLine().toUpperCase();
    
    int count = 0;
    while (true) {
      if (text.contains(pattern))
        count++;
      else
        break;
    
      text = text.substring(text.indexOf(pattern) + 1);
    }
  
    System.out.println(count);
  }
}
