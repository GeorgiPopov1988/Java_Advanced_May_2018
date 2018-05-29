package string_processing.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_tags {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    Pattern pattern = Pattern.compile("<.*?>");
    String input = reader.readLine();
    while (!"END".equals(input)) {
      
      Matcher matcher = pattern.matcher(input);
      while (matcher.find()) {
        System.out.println(matcher.group());
      }
      input = reader.readLine();
    }
    
    
  }
}
