package linear_structures.lab.stack_and_queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Hot_potato {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] names = scanner.nextLine().split("\\s+");
    int indexOut = Integer.parseInt(scanner.nextLine());
  
    ArrayDeque<String> players= new ArrayDeque<>();
    Collections.addAll(players, names);
  
    while (players.size() > 1) {
      for (int i = 1; i < indexOut; i++) {
        String playerName = players.poll();
        players.offer(playerName);
      }
      String removedPlayer = players.poll();
      System.out.println("Removed " + removedPlayer);
    }
    String winnerName = players.poll();
    System.out.println("Last is " + winnerName);
  }
}
