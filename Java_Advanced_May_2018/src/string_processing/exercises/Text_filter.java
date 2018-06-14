package string_processing.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Text_filter {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    List<String> banList = Arrays.stream(reader.readLine().split(", ")).collect(Collectors.toList());
    String text = reader.readLine();
  
    for (String bannedWord : banList) {
      text = text.replaceAll(bannedWord, repeatStr(bannedWord.length(), "*"));
    }
    System.out.println(text);
  }
  static String repeatStr(int count, String text){
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < count; i++) {
      stringBuilder.append(text);
    }
    return stringBuilder.toString();
  }
}
