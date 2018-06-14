package intro_to_Java.lab;

import java.math.BigInteger;
import java.util.Scanner;

public class Product_of_numbers_N_M {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    BigInteger result = BigInteger.ONE;
    System.out.printf("product[%d..%d] = ", n, m);
    
    while (n <= m) {
      result = result.multiply(new BigInteger(String.valueOf(n)));
      n++;
    }
    System.out.printf("%s", result);
  }
}
