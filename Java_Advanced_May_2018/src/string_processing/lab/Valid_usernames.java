package string_processing.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid_usernames {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    Pattern pattern = Pattern.compile("^[\\w-]{3,16}$");
    List<String> result = new ArrayList<>();
    
    String input = reader.readLine();
    while (!"END".equals(input)) {
      Matcher matcher = pattern.matcher(input);
      if (matcher.find()) {
        result.add("valid");
      } else {
        result.add("invalid");
      }
      input = reader.readLine();
    }
    if (result.contains("valid")) {
      for (String str : result) {
        System.out.println(str);
      }
    }
    
  }
}
