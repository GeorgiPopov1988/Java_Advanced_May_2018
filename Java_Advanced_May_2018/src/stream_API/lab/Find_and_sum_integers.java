package stream_API.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class Find_and_sum_integers {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    Optional<Integer> sum = Arrays.stream(reader.readLine().split(" "))
            .filter(x -> !x.isEmpty())
            .filter(x -> isNumber(x))
            .map(Integer::parseInt)
            .reduce((x1, x2) -> x1 + x2);
    
    if (sum.isPresent()) {
      System.out.println(sum.get());
    } else {
      System.out.println("No match");
    }
    
  }
  
  private static boolean isNumber(String x) {
   try {
     int value = Integer.parseInt(x);
     return true;
   } catch (NumberFormatException e) {
     return  false;
   }
  }
}
