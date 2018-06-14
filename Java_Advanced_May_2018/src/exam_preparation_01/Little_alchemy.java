package exam_preparation_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Little_alchemy {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int[] inNumbers = Arrays.stream(reader.readLine().split(" "))
            .mapToInt(Integer::parseInt).toArray();
    
    ArrayDeque<Integer> stones = fillStones(inNumbers);
    
    int gold = 0;
    
    String inLine = reader.readLine();
    while (!"Revision".equalsIgnoreCase(inLine)) {
      String[] inTokens = inLine.split(" ");
      String command = inTokens[0];
      int doses = Integer.parseInt(inTokens[2]);
      
      if ("Apply".equalsIgnoreCase(command)) {
        gold = applyDosesOnStoneList(stones, gold, doses);
      } else if ("Air".equalsIgnoreCase(command)) {
        gold = leakInTheStorage(stones, gold, doses);
      }
      inLine = reader.readLine();
    }
    printResult(stones, gold);
    
  }
  
  public static void printResult(ArrayDeque<Integer> stones, int gold) {
    StringBuilder stringBuilder = new StringBuilder();
    for (Integer stone : stones) {
      stringBuilder.append(stone).append(" ");
    }
    stringBuilder.append(System.lineSeparator());
    stringBuilder.append(gold);
    
    System.out.println(stringBuilder.toString());
  }
  
  public static int leakInTheStorage(ArrayDeque<Integer> stones, int gold, int doses) {
    if (gold > 0) {
      gold--;
      stones.addLast(doses);
    }
    return gold;
  }
  
  public static int applyDosesOnStoneList(ArrayDeque<Integer> stones, int gold, int doses) {
    for (int i = 0; i < doses; i++) {
      if (!stones.isEmpty()) {
        int test = stones.getFirst();
        stones.removeFirst();
        test--;
        if (test > 0) {
          stones.addLast(test);
        } else {
          gold++;
        }
      }
    }
    return gold;
  }
  
  public static ArrayDeque<Integer> fillStones(int[] inNumbers) {
    ArrayDeque<Integer> stones = new ArrayDeque<>();
    
    for (int number : inNumbers) {
      stones.addLast(number);
    }
    return stones;
  }
}
