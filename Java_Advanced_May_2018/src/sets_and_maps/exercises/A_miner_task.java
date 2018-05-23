package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class A_miner_task {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Map<String, Integer> bank = new HashMap<>();
    
    String resource = reader.readLine();
    addRresources(reader, bank, resource);
    print(bank);
  
  }
  
  private static void print(Map<String, Integer> bank) {
    for (Map.Entry<String, Integer> map : bank.entrySet()) {
      System.out.printf("%s -> %s%n", map.getKey(), map.getValue());
    }
  }
  
  private static void addRresources(BufferedReader reader, Map<String, Integer> bank, String resource) throws IOException {
    while (!"stop".equals(resource)) {
      int quantity = Integer.parseInt(reader.readLine());
      if (!bank.containsKey(resource)){
        bank.put(resource, quantity);
      } else {
        bank.put(resource, bank.get(resource) + quantity);
      }
      resource = reader.readLine();
    }
  }
}
