package stream_API.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Strudents_by_age {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String inLine = reader.readLine();
  
    Map<String, Integer> students = new LinkedHashMap<>();
    while (!"END".equals(inLine)) {
      String[] studentTokens = inLine.split(" ");
      String name = studentTokens[0] + " " +studentTokens[1];
      int age = Integer.parseInt(studentTokens[2]);
      
      students.putIfAbsent(name, age);
      
      inLine = reader.readLine();
    }
    
    students.entrySet().stream().filter(s -> s.getValue() >= 18 && s.getValue() <= 24)
            .forEach(s -> System.out.printf("%s %d%n", s.getKey(), s.getValue()));
    
  }
}
