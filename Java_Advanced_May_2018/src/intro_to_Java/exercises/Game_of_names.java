package intro_to_Java.exercises;

import java.util.*;

public class Game_of_names {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int playersCnt = Integer.parseInt(scanner.nextLine());
    Map<String, Integer> players = new HashMap<>();
    int max = Integer.MIN_VALUE;
    
    while (playersCnt-- > 0) {
      String name = scanner.nextLine();
      int score = Integer.parseInt(scanner.nextLine());
      
      for (int i = 0; i < name.length(); i++) {
        int current = name.charAt(i);
        if (current % 2 == 0) {
          score += current;
        } else if (current % 2 != 0) {
          score -= current;
        }
      }
      players.put(name, score);
    }
    String winnerName = Collections
            .max(players.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
//    String winnerName = Collections
//            .max(players.entrySet(), (e1, e2) -> e1.getValue() - e2.getValue()).getKey();
    int winnerScore = players.get(winnerName);
    System.out.printf("The winner is %s - %d points", winnerName, winnerScore);
  }
}
