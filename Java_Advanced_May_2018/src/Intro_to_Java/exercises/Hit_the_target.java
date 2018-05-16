package Intro_to_Java.exercises;

import java.util.Scanner;

public class Hit_the_target {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int target = Integer.parseInt(scanner.nextLine());
    
    for (int num1 = 1; num1 <= 20; num1++) {
      for (int num2 = 1; num2 <= 20; num2++) {
        String result = check(target, num1, num2);
        if (!result.trim().isEmpty()) {
          System.out.println(result);
        }
      }
    }
  }
  
  private static String check(int target, int num1, int num2) {
    String message = "";
    
    if (num1 + num2 == target) {
      message = String.format("%s + %s = %s", num1, num2, target);
    } else if (num1 - num2 == target) {
      message = String.format("%s - %s = %s", num1, num2, target);
    }
    return message;
  }
}
