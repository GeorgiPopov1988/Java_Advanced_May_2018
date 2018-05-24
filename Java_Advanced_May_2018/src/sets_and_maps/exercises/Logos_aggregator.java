package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Logos_aggregator {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    Map<String, Integer> userDurations = new TreeMap<>();
    HashMap<String, TreeSet<String>> userIpAddresses = new HashMap<>();
    
    int usersCnt = Integer.parseInt(reader.readLine());
    while (usersCnt-- > 0) {
      String[] inTokens = reader.readLine().split(" ");
      String ip = inTokens[0];
      String name = inTokens[1];
      int duration = Integer.parseInt(inTokens[2]);
  
      addInformation(userDurations, userIpAddresses, ip, name, duration);
    }
  
    printResult(userDurations, userIpAddresses);
  
  
  }
  
  private static void printResult(Map<String, Integer> userDurations, HashMap<String, TreeSet<String>> userIpAddresses) {
    for (Map.Entry<String, Integer> durations : userDurations.entrySet()) {
      String name = durations.getKey();
      // alex: 62 [10.10.17.33, 212.50.118.81]
      System.out.printf("%s: %s ", name, durations.getValue());
      System.out.println(userIpAddresses.get(name));
    }
  }
  
  private static void addInformation(Map<String, Integer> userDurations, HashMap<String, TreeSet<String>> userIpAddresses, String ip, String name, int duration) {
    if (!userDurations.containsKey(name)) {
      userDurations.put(name, 0);
    }
    userDurations.put(name, userDurations.get(name) + duration);
    
    if (!userIpAddresses.containsKey(name)) {
      userIpAddresses.put(name, new TreeSet<>());
    }
    
    TreeSet<String> value = userIpAddresses.get(name);
    value.add(ip);
    userIpAddresses.put(name, value);
  }
}
