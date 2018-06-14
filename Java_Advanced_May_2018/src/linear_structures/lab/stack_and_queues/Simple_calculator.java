package linear_structures.lab.stack_and_queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Simple_calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] line = scanner.nextLine().split(" ");
    ArrayDeque<String> stack = new ArrayDeque<>();
  
    Collections.addAll(stack, line);
  
    //stack.push("2");
    //stack.push("+");
    //stack.push("5");
    //stack.push("+");
    //stack.push("10");
    //stack.push("-");
    //stack.push("2");
    //stack.push("-");
    //stack.push("1");
    //System.out.println();
    
    while (stack.size() > 1) {
      int sum;
      int num1 = Integer.parseInt(stack.pop());
      String operator = stack.pop();
      int num2 = Integer.parseInt(stack.pop());
      switch (operator) {
        case "-":
          sum = num1 - num2;
          stack.push(String.valueOf(sum));
          break;
        case "+":
          sum = num1 + num2;
          stack.push(String.valueOf(sum));
          break;
      }
    }
    System.out.println(stack.pop());
  }
}
