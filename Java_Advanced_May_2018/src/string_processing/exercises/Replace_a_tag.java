package string_processing.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace_a_tag {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // <ul> <li> <a href="http://softuni.bg">SoftUni</a>
    // </li> </ul>
    
    StringBuilder stringBuilder = new StringBuilder();
  
    String line = readInput(reader, stringBuilder);
    Pattern pattern = Pattern.compile("(<a)\\s*href[^>]+(>)\\s*.*?(<\\/a>)");
    String text = replaceTags(stringBuilder, pattern);
    System.out.println(text);
    
    
  }
  
  private static String replaceTags(StringBuilder stringBuilder, Pattern pattern) {
    String text = stringBuilder.toString();
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      String fullMatch = matcher.group(0);
      String startTag = matcher.group(1);
      String endOfStartTag = matcher.group(2);
      String endTag = matcher.group(3);
  
      String result = fullMatch
              .replaceFirst(startTag, "[URL")
              .replaceFirst(endOfStartTag, "]")
              .replaceFirst(endTag, "[/URL]");
      text = text.replace(fullMatch, result);
    }
    return text;
  }
  
  private static String readInput(BufferedReader reader, StringBuilder stringBuilder) throws IOException {
    String readLine = reader.readLine();
    
    while (!"END".equals(readLine)) {
      stringBuilder.append(readLine).append(System.lineSeparator());
      readLine = reader.readLine();
    }
    return readLine;
  }
}
