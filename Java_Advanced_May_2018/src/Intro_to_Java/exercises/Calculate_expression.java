package Intro_to_Java.exercises;

import java.util.Scanner;

public class Calculate_expression {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    
    double f1 =
    Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) /
            (Math.pow(a, 2) - Math.pow(b, 2))), (a + b + c) / Math.sqrt(c));
    double f2 = Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3), (a - b));
    
    double avrgABC = (a + b + c) / 3;
    double avrgF1F2 = (f1 + f2) / 2;
    double absDiff = Math.abs(avrgABC - avrgF1F2);
  
    System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, absDiff);
  }
}
