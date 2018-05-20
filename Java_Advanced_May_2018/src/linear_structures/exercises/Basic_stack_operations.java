package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Basic_stack_operations {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] commands = reader.readLine().split(" ");
    int pushCnt = Integer.parseInt(commands[0]);
    int popCnt = Integer.parseInt(commands[1]);
    int isPresent = Integer.parseInt(commands[2]);
    
    String[] input = reader.readLine().split(" ");
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    
    for (int i = 0; i < pushCnt; i++) {
      stack.push(Integer.parseInt(input[i]));
    }
  
    for (int j = 0; j < popCnt; j++) {
      stack.pop();
    }
  
    if (stack.contains(isPresent)) {
      System.out.println(true);
    } else if (!stack.isEmpty()){
      stack.descendingIterator();
      System.out.println(stack.getFirst());
    } else {
      System.out.println("0");
    }
  
  
  }
}
