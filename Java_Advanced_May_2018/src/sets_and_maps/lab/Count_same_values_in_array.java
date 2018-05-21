package sets_and_maps.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Count_same_values_in_array {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    String[] numbers = reader.readLine().split(" ");
    HashMap<String, Integer> box = new HashMap<>();
  
    for (String number : numbers) {
      if (!box.containsKey(number)) {
        box.put(number, 0);
      }
      box.put(number, box.get(number) + 1);
    }
  
    for (Map.Entry<String, Integer> map : box.entrySet()) {
      System.out.printf("%s - %s times%n", map.getKey(), map.getValue());
    }
  }
}
