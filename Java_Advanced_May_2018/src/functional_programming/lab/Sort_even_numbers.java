package functional_programming.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_even_numbers {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    List<Integer> numbers = Arrays.stream(reader.readLine().split(", "))
            .map(Integer::parseInt).collect(Collectors.toList());
    
    numbers.removeIf(n -> n % 2 != 0);
    System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    
    numbers.sort((a, b) -> a.compareTo(b));
    System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
  }
}
