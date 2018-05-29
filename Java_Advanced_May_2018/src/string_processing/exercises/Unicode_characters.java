package string_processing.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;

public class Unicode_characters {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String text = reader.readLine();
    StringBuilder stringBuilder = new StringBuilder();
    //Formatter formatter = new Formatter(stringBuilder);
  
    for (char c : text.toCharArray()) {
      stringBuilder.append(String.format("\\u%04x", (int) c));
      //if (c < 128) {
      //  stringBuilder.append(c);
      //} else {
      //  formatter.format("\\u%04x", (int)c);
      //}
    }
  
    System.out.println(stringBuilder.toString());
    
  }
}
