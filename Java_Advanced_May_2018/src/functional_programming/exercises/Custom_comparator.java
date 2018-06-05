package functional_programming.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Custom_comparator {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    int[] numbers = Arrays.stream(reader.readLine()
            .split("\\s+")).mapToInt(Integer::parseInt).toArray();
    List<Integer> odds = new ArrayList<>();
    List<Integer> evens = new ArrayList<>();
  
    for (Integer num : numbers) {
      if (num % 2 == 0) {
        odds.add(num);
      } else if (num % 2 != 0) {
        evens.add(num);
      }
    }
    Collections.sort(odds);
    Collections.sort(evens);
    if (!odds.isEmpty()) {
      for (Integer odd : odds) {
        System.out.print(odd + " ");
      }
    }
    
    if (!evens.isEmpty()) {
      for (Integer even : evens) {
        System.out.print(even + " ");
      }
    }
  }
}
