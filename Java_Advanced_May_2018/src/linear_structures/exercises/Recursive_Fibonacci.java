package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursive_Fibonacci {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    
    int n = Integer.parseInt(reader.readLine()) + 1;
    
    getNthFibonacci(n);
  }
  
  private static void getNthFibonacci(int n) {
    if (n == 1 || n == 2) {
      System.out.println(1);
      return;
    }
  
    long fib1 = 1;
    long fib2 = 1;
    long fib3 = 2;
  
    for (int i = 3; i < n; i++) {
      fib1 = fib2;
      fib2 = fib3;
      fib3 = fib1 + fib2;
    }
  
    System.out.println(fib3);
  }
}