package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class Reverse_numbers_with_stack {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] line = reader.readLine().split(" ");
    ArrayDeque<String> stack = new ArrayDeque<>();
  
    for (String in : line) {
      stack.push(in);
    }
    for (String out : stack) {
      System.out.print(stack.pop()+" ");
    }
    
  }
}
