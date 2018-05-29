package string_processing.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parse_tags {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String text = reader.readLine();
    
    //String startTag = "<upcase>";
    //String endTag = "</upcase>";
    
    while (text.contains("<upcase>")) {
      int startIndex = text.indexOf("<upcase>");
      int endIndex = text.indexOf("</upcase>");
      
      String toUpper = text.substring(startIndex + "<upcase>".length(), endIndex).toUpperCase();
      String toReplace = text.substring(startIndex, endIndex + "</upcase>".length());
      
      text = text.replace(toReplace, toUpper);
    }
    System.out.println(text);
  }
}
