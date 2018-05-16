package Intro_to_Java.exercises;

import java.util.Scanner;

public class Formatting_numbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int a = scanner.nextInt();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
  
    String aToHex = Integer.toHexString(a).toUpperCase();
    String aToBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
    
  
    System.out.println(String.format("|%1$-10s|%2$s|%3$10.2f|%4$-10.3f|", aToHex, aToBinary, b, c));
  }
}
