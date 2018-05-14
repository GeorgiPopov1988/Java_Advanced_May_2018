package Intro_to_Java.lab;

import java.util.Scanner;

public class Average_of_three_numbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double firstNum = scanner.nextDouble();
    double secondNum = scanner.nextDouble();
    double thirdNum = scanner.nextDouble();
    
    double avr = (firstNum + secondNum + thirdNum) / 3;
  
    System.out.printf("%.2f", avr);
  }
}
