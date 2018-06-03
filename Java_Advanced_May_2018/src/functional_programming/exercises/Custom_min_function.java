package functional_programming.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Custom_min_function {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    List<Integer> numbers = Arrays
            .stream(reader.readLine()
                    .split(" "))
            .map(Integer::parseInt).sorted(Integer::compareTo)
            .collect(Collectors.toList());
  
    System.out.printf("%d", numbers.get(0));
    
  }
}
