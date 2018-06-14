package intro_to_Java.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class Euro_trip {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double quantity = Double.parseDouble(scanner.nextLine());
  
    BigDecimal priceInLeva = new BigDecimal(quantity * 1.20);
    BigDecimal exchangeRate = new BigDecimal("4210500000000");
    BigDecimal result = priceInLeva.multiply(exchangeRate);
  
    System.out.printf("%.2f marks", result);
  }
}
