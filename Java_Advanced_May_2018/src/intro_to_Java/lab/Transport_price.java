package intro_to_Java.lab;

import java.util.Scanner;

public class Transport_price {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int distance = Integer.parseInt(scanner.nextLine());
    String dayTime = scanner.nextLine();
    double pricePerKilometer = 0.0d;
    double price = 0.0d;
    
    if (distance < 20) {
      double initialTax = 0.7d;
      price += initialTax;
      if ("day".equals(dayTime)) {
          pricePerKilometer = 0.79d;
      } else if ("night".equals(dayTime)) {
          pricePerKilometer = 0.9d;
      }
      
    } else if (distance < 100) {
      pricePerKilometer = 0.09d;
    } else {
      pricePerKilometer = 0.06d;
    }
    
    price = price + (pricePerKilometer * distance);
  
    System.out.printf("%.2f", price);
  }
}
