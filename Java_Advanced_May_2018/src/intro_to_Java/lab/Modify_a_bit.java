package intro_to_Java.lab;

import java.util.Scanner;

public class Modify_a_bit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int p = scanner.nextInt();
    int v = scanner.nextInt();
    int mask;
    int result = 0;
    
    if (v == 0) {
      mask = ~(1<<p);
      result = n & mask;
    } else if (v == 1) {
      mask = 1 << p;
      result = n | mask;
    }
  
    System.out.println(result);
  }
}
