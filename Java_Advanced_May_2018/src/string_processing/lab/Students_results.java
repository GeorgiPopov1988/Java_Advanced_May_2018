package string_processing.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Students_results {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] studentTokens = reader.readLine().split("[ ,-]+");
    System.out.printf("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|%n",
            "Name", "JAdv", "JavaOOP", "AdvOOP", "Average");
    
    double average = (Double.parseDouble(studentTokens[1]) +
                     Double.parseDouble(studentTokens[2]) +
                     Double.parseDouble(studentTokens[3]) )/ 3.0;
  
    System.out.printf("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|%n",
            studentTokens[0]
            , Double.parseDouble(studentTokens[1])
            , Double.parseDouble(studentTokens[2])
            , Double.parseDouble(studentTokens[3])
            , average);
    
    
  }
}
