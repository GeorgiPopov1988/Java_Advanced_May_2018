package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class User_logs {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();

    String line = reader.readLine();
    addUsers(reader, data, line);
    printData(data);
  
  }
  
  private static void addUsers(BufferedReader reader, TreeMap<String, LinkedHashMap<String, Integer>> data, String line) throws IOException {
    while (!"end".equals(line)) {
      String[] inTokens = line.split(" ");
      String[] ipTokens = inTokens[0].split("=");
      String[] userTokens = inTokens[2].split("=");
      
      String userName = userTokens[1];
      String ipAdres = ipTokens[1];
      
      if (!data.containsKey(userName)) {
        data.put(userName, new LinkedHashMap<>());
      }
      if (!data.get(userName).containsKey(ipAdres)) {
        data.get(userName).put(ipAdres, 0);
      }
      data.get(userName).put(ipAdres, data.get(userName).get(ipAdres) + 1);
      
      line = reader.readLine();
    }
  }
  
  private static void printData(TreeMap<String, LinkedHashMap<String, Integer>> data) {
  
    for (Map.Entry<String, LinkedHashMap<String, Integer>> dataTokens : data.entrySet()) {
      System.out.printf("%s: %n", dataTokens.getKey());
  
      int cnt = 0;
      for (Map.Entry<String, Integer> userTokens : dataTokens.getValue().entrySet()) {
        
        if (cnt == dataTokens.getValue().size() - 1) {
          System.out.printf("%s => %d.%n", userTokens.getKey(), userTokens.getValue());
        } else {
          System.out.printf("%s => %d, ", userTokens.getKey(), userTokens.getValue());
        }
        cnt++;
      }
    }
  }
}
