package intro_to_Java.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Odd_and_even_pairs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
            .mapToInt(Integer::parseInt).toArray();
    
    if (numbers.length % 2 != 0) {
      System.out.println("invalid length");
    } else {
      
      for (int i = 0; i < numbers.length - 1; i+=2) {
        String message;
        int current = numbers[i];
        int next = numbers[i + 1];
        
        if (current % 2 == 0 && next % 2 == 0) {
          message = "both are even";
        } else if (current % 2 != 0 && next % 2 != 0) {
          message = "both are odd";
        } else {
          message = "different";
        }
  
          System.out.printf("%d, %d -> %s%n", current, next, message);
      }
    }
  }
}
