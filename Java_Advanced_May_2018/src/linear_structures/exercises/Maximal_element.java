package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Maximal_element {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder();
    
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    ArrayDeque<Integer> maxi = new ArrayDeque<>();
    
    int commandsCnt = Integer.parseInt(reader.readLine());
    
    for (int i = 0; i < commandsCnt; i ++) {
      String[] commandsTokens = reader.readLine().split(" ");
      String command = commandsTokens[0];

      switch (command) {
        case "1":
          int num = Integer.parseInt(commandsTokens[1]);
          stack.push(num);
          if (maxi.isEmpty() || maxi.peek() < num) {
            maxi.push(num);
          }
          break;
        case "2":
          if (maxi.peek().equals(stack.pop())){
            maxi.pop();
          }
          break;
        case "3":
          stringBuilder.append(maxi.peek()).append(System.lineSeparator());
          break;
      }
    }
    System.out.println(stringBuilder);
  }
}
