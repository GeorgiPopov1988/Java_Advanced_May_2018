package functional_programming.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Applied_arithmetics {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int[] numbers = Arrays
            .stream(reader.readLine()
            .split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();
    
    UnaryOperator<Integer> add = n -> n + 1;
    UnaryOperator<Integer> multiply = n -> n * 2;
    UnaryOperator<Integer> subtract = n -> n - 1;
    
    String command = reader.readLine();
    while (!"end".equals(command)) {
      
      
        switch (command) {
          case "add":
            for (int i = 0; i < numbers.length; i++) {
              //numbers[i] += 1;
              numbers[i] = add.apply(numbers[i]);
            }
            break;
          case "multiply":
            for (int i = 0; i < numbers.length; i++) {
              //numbers[i] *= 2;
              numbers[i] = multiply.apply(numbers[i]);
            }
            break;
          case "subtract":
            for (int i = 0; i < numbers.length; i++) {
              //numbers[i] -= 1;
              numbers[i] = subtract.apply(numbers[i]);
            }
            break;
          case "print":
            for (int number : numbers) {
              System.out.print(number + " ");
            }
            System.out.println();
            break;
        }
        
      
      command = reader.readLine();
    }
  }
}
