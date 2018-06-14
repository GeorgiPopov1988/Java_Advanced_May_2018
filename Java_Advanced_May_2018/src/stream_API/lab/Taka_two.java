package stream_API.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Taka_two {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt)
            .filter(n -> n >= 10 && n <= 20)
            .distinct()
            .limit(2)
            .collect(Collectors.toList());
    
    numbers.forEach(n -> System.out.print(n + " "));
    
    
    
    
  }
}
