package stream_API.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Weak_students {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    String inLine = reader.readLine();
    Set<String> students = new LinkedHashSet<>();
    while (!"END".equals(inLine)) {
    
      String[] inTokens = inLine.split(" ");
      String name = inTokens[0] + " " + inTokens[1];
    
      boolean isWeak = false;
      int cnt = 0;
      for (int i = 2; i < inTokens.length; i++) {
        int grade = Integer.parseInt(inTokens[i]);
        if (grade <= 3) {
          cnt++;
          if (cnt == 2) {
            isWeak = true;
            break;
          }
        }
      }
      if (isWeak) {
        students.add(name);
      }
      inLine = reader.readLine();
    }
  
    System.out.print(String.join(System.lineSeparator(), students));
  }
}
