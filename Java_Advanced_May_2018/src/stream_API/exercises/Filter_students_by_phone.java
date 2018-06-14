package stream_API.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Filter_students_by_phone {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    String inLine = reader.readLine();
    Set<String> students = new LinkedHashSet<>();
    while (!"END".equals(inLine)) {
      String[] inTokens = inLine.split(" ");
      String phone = inTokens[2];
    
      if (phone.startsWith("02") || phone.startsWith("+3592")) {
        students.add(inTokens[0] + " " + inTokens[1]);
      }
      inLine = reader.readLine();
    }
    System.out.print(String.join(System.lineSeparator(), students));
    
    
    
  }
}
