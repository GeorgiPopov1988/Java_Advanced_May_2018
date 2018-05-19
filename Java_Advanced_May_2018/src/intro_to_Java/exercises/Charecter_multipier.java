package intro_to_Java.exercises;

import java.util.Scanner;

public class Charecter_multipier {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    String firstStr = scanner.next();
    String secondStr = scanner.next();
  
    long result = 0L;
    int multiplyIterations = Math.min(firstStr.length(), secondStr.length());
  
    for (int i = 0; i < multiplyIterations; i++) {
      result += firstStr.charAt(i) * secondStr.charAt(i);
    }
    
    if (firstStr.length() > multiplyIterations) {
      for (int i = multiplyIterations; i < firstStr.length(); i++) {
        result += firstStr.charAt(i);
      }
    } else if (secondStr.length() > multiplyIterations) {
      for (int i = multiplyIterations; i < secondStr.length(); i++) {
        result += secondStr.charAt(i);
      }
    }
    System.out.println(result);
  }
}
