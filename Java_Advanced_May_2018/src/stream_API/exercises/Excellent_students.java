package stream_API.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Excellent_students {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String inLine = reader.readLine();
    Set<String> students = new LinkedHashSet<>();
    while (!"END".equals(inLine)) {
      
      String[] inTokens = inLine.split(" ");
      String name = inTokens[0] + " " + inTokens[1];
  
      boolean isExcellent = false;
      for (int i = 2; i < inTokens.length; i++) {
        if (inTokens[i].equals("6")) {
          isExcellent = true;
        }
      }
      if (isExcellent) {
        students.add(name);
      }
      inLine = reader.readLine();
    }
    
    System.out.print(String.join(System.lineSeparator(), students));
  }
}
