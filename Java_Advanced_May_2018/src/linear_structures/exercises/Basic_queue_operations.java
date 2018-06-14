package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Basic_queue_operations {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    
    String[] commands = reader.readLine().split(" ");
    int pushCnt = Integer.parseInt(commands[0]);
    int popCnt = Integer.parseInt(commands[1]);
    int isPresent = Integer.parseInt(commands[2]);
    
    String[] input = reader.readLine().split(" ");
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    
    for (int i = 0; i < pushCnt; i++) {
      queue.offer(Integer.parseInt(input[i]));
    }
    
    for (int j = 0; j < popCnt; j++) {
      queue.poll();
    }
    
    if (queue.contains(isPresent)) {
      System.out.println(true);
    } else if (!queue.isEmpty()) {
      int min = Integer.MAX_VALUE;
      for (Integer integer : queue) {
        if (min > integer) {
          min = integer;
        }
      }
      System.out.println(min);
    } else {
      System.out.println("0");
    }
    
    
  }
}
