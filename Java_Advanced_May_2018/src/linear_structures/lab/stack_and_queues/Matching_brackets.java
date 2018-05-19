package linear_structures.lab.stack_and_queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Matching_brackets {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    String input = scanner.nextLine();
    ArrayDeque<Integer> box = new ArrayDeque<>();
  
    for (int index = 0; index < input.length(); index++) {
      char currentChar = input.charAt(index);
      if (currentChar == '('){
        box.push(index);
      }else if (currentChar == ')'){
        int startIndex = box.pop();
        String result = input.substring(startIndex, index + 1);
        System.out.println(result);
      }
    }
    
    
  }
}
