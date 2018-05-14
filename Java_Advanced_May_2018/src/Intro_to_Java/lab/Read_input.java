package Intro_to_Java.lab;

import java.util.Scanner;

public class Read_input {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    String firstStr = scanner.next();
    String secindStr = scanner.next();
    int firstNum = scanner.nextInt();
    int secondNum = scanner.nextInt();
    int thirdNum = scanner.nextInt();
    scanner.nextLine();
    String thirdStr = scanner.nextLine();
    
    int sum = firstNum + secondNum +thirdNum;
  
    System.out.printf("%s %s %s %s%n", firstStr, secindStr, thirdStr, sum);
    
  }
}
