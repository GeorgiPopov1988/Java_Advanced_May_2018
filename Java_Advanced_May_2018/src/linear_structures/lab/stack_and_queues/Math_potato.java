package linear_structures.lab.stack_and_queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Math_potato {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    String[] names = scanner.nextLine().split("\\s+");
    int num = Integer.parseInt(scanner.nextLine());
  
    ArrayDeque<String> players = new ArrayDeque<>();
    Collections.addAll(players, names);
    int counter = 1;
  
    while (players.size() > 1){
    
      for (int i = 1; i < num; i++) {
        String inGame = players.poll();
        players.offer(inGame);
      }
    
      if (isPrime(counter)){
        String prime = players.peek();
        System.out.println("Prime " + prime);
      
      }else{
        String removed = players.poll();
        System.out.println("Removed " + removed);
      }
    
      counter++;
    }
  
    String winner = players.poll();
    System.out.println("Last is " + winner);
    
  }
  private static boolean isPrime(int number) {
    
    if (number == 1){
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0){
        return false;
      }
    }
    return true;
  }
}
