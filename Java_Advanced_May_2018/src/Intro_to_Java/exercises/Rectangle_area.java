package Intro_to_Java.exercises;

import java.util.Scanner;

public class Rectangle_area {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    
    double area = a * b;
  
    System.out.printf("%.2f", area);
  }
}
