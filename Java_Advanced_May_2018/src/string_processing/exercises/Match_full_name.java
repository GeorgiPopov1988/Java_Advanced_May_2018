package string_processing.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match_full_name {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
    
    String input = reader.readLine();
    while (!"end".equals(input)) {
      Matcher matcher = pattern.matcher(input);
      if (matcher.find()) {
        System.out.println(input);
      }
      input = reader.readLine();
    }
  }
  
}

