package sets_and_maps.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Voina {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String[] playerOneNumbers = reader.readLine().split(" ");
    String[] playerTwoNumbers = reader.readLine().split(" ");
    Set<Integer> playerOne = new LinkedHashSet<>();
    Set<Integer> playerTwo = new LinkedHashSet<>();
  
    fillDecks(playerOneNumbers, playerTwoNumbers, playerOne, playerTwo);
  
    int rounds = 0;
    while (rounds++ < 50) {
      voina(playerOne, playerTwo);
      
      if (checkForWinner(playerOne, playerTwo)) {
        return;
      }
    }
    getWinnerByDeckSize(playerOne, playerTwo);
  }
  
  private static void fillDecks(String[] playerOneNumbers, String[] playerTwoNumbers, Set<Integer> playerOne, Set<Integer> playerTwo) {
    for (int i = 0; i < 20; i++) {
      playerOne.add(Integer.parseInt(playerOneNumbers[i]));
      playerTwo.add(Integer.parseInt(playerTwoNumbers[i]));
    }
  }
  
  private static void getWinnerByDeckSize(Set<Integer> playerOne, Set<Integer> playerTwo) {
    int playerOneDeckSize = playerOne.size();
    int playerTwoDeckSize = playerTwo.size();
    if (playerOneDeckSize == playerTwoDeckSize) {
      System.out.println("Draw!");
    } else if (playerOneDeckSize > playerTwoDeckSize) {
      System.out.println("First player win!");
    } else {
      System.out.println("Second player win!");
    }
  }
  
  private static void voina(Set<Integer> playerOne, Set<Integer> playerTwo) {
    int oneFirsCard = playerOne.iterator().next();
    int twoFirsCard = playerTwo.iterator().next();
    
    playerOne.remove(oneFirsCard);
    playerTwo.remove(twoFirsCard);
    
    if (oneFirsCard > twoFirsCard) {
      playerOne.add(oneFirsCard);
      playerOne.add(twoFirsCard);
    } else if (twoFirsCard > oneFirsCard) {
      playerTwo.add(oneFirsCard);
      playerTwo.add(twoFirsCard);
    }
  }
  
  private static boolean checkForWinner(Set<Integer> playerOne, Set<Integer> playerTwo) {
    if (playerOne.isEmpty()) {
      System.out.println("Second player win!");
      return true;
    } else if (playerTwo.isEmpty()) {
      System.out.println("First player win!");
      return true;
    }
    return false;
  }
}
