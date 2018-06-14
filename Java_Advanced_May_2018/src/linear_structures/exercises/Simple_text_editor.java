package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Simple_text_editor {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    int operationsCnt = Integer.parseInt(reader.readLine());
    ArrayDeque<String> box = new ArrayDeque<>();
    
    while (operationsCnt-- > 0) {
      String[] operationTokens = reader.readLine().split(" ");
      int operationType = Integer.parseInt(operationTokens[0]);
      
      switch (operationType) {
        case 1:
          // 1 [string]" - appends [string] to the end of the text
          String appendStr = operationTokens[1];
          if (!box.isEmpty()) {
            box.addLast(box.getLast() + appendStr);
          } else {
            box.addLast(appendStr);
          }
          break;
        case 2:
          // 2 [count]" - erases the last [count] elements from the text
          int removeCnt = Integer.parseInt(operationTokens[1]);
          appendStr = box.getLast().substring(0,box.getLast().length() - removeCnt);
          box.addLast(appendStr);
          break;
        case 3:
          // 3 [index]" - returns the element at position [index] from the text
          int index = Integer.parseInt(operationTokens[1]);
          String word = box.getLast();
          System.out.println(word.charAt(index - 1));
          break;
        case 4:
          // 4 - undoes the last not-undone command of
          // type 1 or 2 and returns the text to the state before that operation
          box.removeLast();
          break;
      }
    }
  }
}
