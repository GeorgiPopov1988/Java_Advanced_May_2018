package functional_programming.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;

public class Knights_of_honor {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    String[] names = reader.readLine().split(" ");
    Consumer<String> print = s -> System.out.printf("Sir %s%n", s);
    Arrays.stream(names).forEach(print);
    
    
    
  }
}
