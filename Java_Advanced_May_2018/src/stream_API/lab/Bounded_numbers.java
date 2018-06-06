package stream_API.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bounded_numbers {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    int[] bounds = Arrays.stream(reader.readLine().split(" "))
            .sorted()
            .mapToInt(Integer::parseInt).toArray();
    int min = bounds[0];
    int max = bounds[1];
    
    int[] numbers = Arrays.stream(reader.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .filter(n -> n >= min && n <= max)
            .toArray();
  
    for (int number : numbers) {
      System.out.print(number + " ");
    }
    
  }
}
