package functional_programming.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_of_predicates {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> result = new ArrayList<>();
  
    int n = Integer.parseInt(reader.readLine());
    int[] divisors = Arrays.stream(reader.readLine()
            .split("\\s+")).mapToInt(Integer::parseInt).toArray();
  
    for (int i = 1; i <= n; i++) {
      boolean itsNum = true;
      int num = i;
      for (int j = 0; j < divisors.length; j++) {
        int divisor = divisors[j];
        if (num % divisor != 0) {
          itsNum = false;
        }
      }
      if (itsNum) {
        result.add(num);
      }
    }
    System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    
  }
}
