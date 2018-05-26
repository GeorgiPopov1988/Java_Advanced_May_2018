package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Balanced_parentheses {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String input = reader.readLine();
    
    if (input.length() % 2 != 0) {
      System.out.println("NO");
      return;
    }
    
    ArrayDeque<Character> brackets = new ArrayDeque<>();
    boolean isBalanced = true;
    // {  }  (  )  [  ]
    
    isBalanced = isBalanced(input, brackets, isBalanced);
  
    printResult(isBalanced);
  }
  
  private static boolean isBalanced(String input, ArrayDeque<Character> brackets, boolean isBalanced) {
    for (int i = 0; i < input.length(); i++) {
      char currentLetter = input.charAt(i);
      switch (currentLetter) {
        case '(':
        case '{':
        case '[':
          brackets.addLast(currentLetter);
          break;
        case ')':
        case '}':
        case ']':
          char searched = brackets.getLast();
          brackets.removeLast();
          isBalanced = check(currentLetter, searched);
          break;
      }
      if (!isBalanced) {
        break;
      }
    }
    return isBalanced;
  }
  
  private static void printResult(boolean isBalanced) {
    if (isBalanced) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
  
  private static boolean check(char currentLetter, char searched) {
    
    if ((currentLetter == ']' && searched != '[')
            || (currentLetter == '}' && searched != '{')
            || (currentLetter == ')' && searched != '(')) {
      return false;
    }
    return true;
  }
  
}
