package exam_preparation_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascent {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    Map<String, String> decodedWords = new LinkedHashMap<>();
    Pattern pattern = Pattern.compile("([,_])([a-zA-Z]+)([0-9])");
    
    String inLine = reader.readLine();
    while (!"Ascend".equals(inLine)) {
  
      for (Map.Entry<String, String> map : decodedWords.entrySet()) {
        inLine = inLine.replaceAll(map.getKey(), map.getValue());
      }
  
      Matcher matcher = pattern.matcher(inLine);
      while (matcher.find()) {
        
        String decodedWord = decode(matcher);
  
        inLine = inLine.replaceAll(matcher.group(0), decodedWord);
        decodedWords.put(matcher.group(0), decodedWord);
        
        
      }
      System.out.println(inLine);
      inLine = reader.readLine();
    }
    
  }
  
  private static String decode(Matcher encodedWord) {
    String condition = encodedWord.group(1);
    String encodedStr = encodedWord.group(2);
    int digit = Integer.parseInt(encodedWord.group(3));
    
    StringBuilder decoded = new StringBuilder();
    for (int i = 0; i < encodedStr.length(); i++) {
      char currentLett = '\0';
      if (",".equalsIgnoreCase(condition)) {
        currentLett = (char) (encodedStr.charAt(i) + (char)digit);
        
      } else {
        currentLett = (char) (encodedStr.charAt(i) - (char)digit);
      }
      decoded.append(currentLett);
    }
    
    return decoded.toString();
  }
}
