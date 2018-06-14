package stream_API.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Min_even_number {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    Optional<Double> min = Arrays.stream(reader.readLine().split(" "))
            .filter(n -> !n.isEmpty())
            .map(Double::parseDouble)
            .filter(x -> x % 2 == 0)
            .min(Double::compareTo);
    
    if (min.isPresent()) {
      System.out.printf("%.2f", min.get());
    } else {
      System.out.println("No match");
    }
    
    
  }
}
