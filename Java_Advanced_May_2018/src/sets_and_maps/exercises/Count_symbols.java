package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Count_symbols {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    char[] input = reader.readLine().toCharArray();
    Map<Character, Integer> result = new TreeMap<>();
  
    for (char letter : input) {
      if (!result.containsKey(letter)) {
        result.put(letter, 0);
      }
      result.put(letter, result.get(letter) + 1);
    }
  
    for (Map.Entry<Character, Integer> map : result.entrySet()) {
      System.out.printf("%s: %s time/s%n", map.getKey(), map.getValue());
    }
  }
}
