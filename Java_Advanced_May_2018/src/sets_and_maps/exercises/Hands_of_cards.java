package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hands_of_cards {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    HashMap<String, HashSet<String>> box = new LinkedHashMap<>();
  
    addPlayers(reader, box);
    getResults(box);
  
  
  }
  
  private static void getResults(HashMap<String, HashSet<String>> box) {
    for (Map.Entry<String, HashSet<String>> entry : box.entrySet()) {
      long sum = getSum(entry);
      print(entry, sum);
    }
  }
  
  private static void print(Map.Entry<String, HashSet<String>> entry, long sum) {
    System.out.printf("%s: %s%n", entry.getKey(), sum);
  }
  
  private static long getSum(Map.Entry<String, HashSet<String>> entry) {
    HashSet<String> cards = entry.getValue();
    
    long sum = 0;
    
    for (String card : cards) {
    
      int typePower = 0;
      int thePower = 0;
    
      String type = card.substring(card.length() - 1);
      String power = card.substring(0, card.length() - 1);
    
      switch (type) {
        case "S":
          typePower = 4; break;
        case "H":
          typePower = 3; break;
        case "D":
          typePower = 2; break;
        case "C":
          typePower = 1; break;
      }
      switch (power) {
        case "A": thePower = 14; break;
        case "K": thePower = 13; break;
        case "Q": thePower = 12; break;
        case "J": thePower = 11; break;
        default: thePower = Integer.parseInt(power); break;
      }
      sum += typePower * thePower;
    }
    return sum;
  }
  
  private static void addPlayers(BufferedReader reader, HashMap<String, HashSet<String>> box) throws IOException {
    while (true) {
      String input = reader.readLine();
      if ("JOKER".equals(input)) {
        break;
      }
      String[] inputTokens = input.split(":");
      String playerName = inputTokens[0];
      // insert players
      if (!box.containsKey(playerName)) {
        box.put(playerName, new HashSet<>());
      }
      // insert hands of players
      HashSet<String> temp = box.get(playerName);
      String[] hand = inputTokens[1]
              .trim()
              .split("[\\s,]+");
    
      temp.addAll(Arrays.asList(hand));
      box.put(playerName, temp);
    }
  }
}
