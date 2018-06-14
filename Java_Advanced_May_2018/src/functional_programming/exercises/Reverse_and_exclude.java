package functional_programming.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_and_exclude {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    List<Integer> numbers = Arrays
            .stream(reader.readLine()
            .split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
  
    int divisible = Integer.parseInt(reader.readLine());
    
    Collections.reverse(numbers);
    numbers.removeIf(n -> n % divisible == 0);
  
    System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
  }
}
