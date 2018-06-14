package stream_API.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Average_of_doubles {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    double[] inNums = Arrays.stream(reader.readLine().split(" "))
            .filter(n -> !n.isEmpty())
            .mapToDouble(Double::parseDouble).toArray();
  
    OptionalDouble result = Arrays.stream(inNums).average();
    if (result.isPresent()) {
      System.out.printf("%.2f", result.getAsDouble());
    } else {
      System.out.println("No match");
    }
    
    
  }
}
