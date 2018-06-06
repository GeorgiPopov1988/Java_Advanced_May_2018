package stream_API.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Map_districts {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    Map<String, List<Integer>> cities = new HashMap<>();
    
    String[] inCities = reader.readLine().split(" ");
    
    addCities(cities, inCities);
  
    int minPopulation = Integer.parseInt(reader.readLine());
    cities.entrySet().stream()
            .filter(filterByPopulation(minPopulation))
            .sorted(compareByPopulation())
            .forEach(print());
    
    
  }
  
  public static void addCities(Map<String, List<Integer>> cities, String[] inCities) {
    for (String inCity : inCities) {
      String[] cityTokens = inCity.split(":");
      String cityName = cityTokens[0];
      int cityPopulation = Integer.parseInt(cityTokens[1]);
      
      if (!cities.containsKey(cityName)) {
        cities.put(cityName, new LinkedList<>());
      }
      cities.get(cityName).add(cityPopulation);
    }
  }
  
  private static Consumer<Map.Entry<String, List<Integer>>> print() {
    return kvp ->{
      System.out.print(kvp.getKey() + ": ");
      kvp.getValue().stream().sorted((n1, n2) -> Integer.compare(n2, n1))
              .limit(5)
              .forEach(x -> System.out.print(x + " "));
      System.out.println();
    };
  }
  
  private static Comparator<Map.Entry<String, List<Integer>>> compareByPopulation() {
    return (kvp1, kvp2) -> Integer.compare(
            kvp2.getValue().stream().mapToInt(Integer::intValue).sum(),
            kvp1.getValue().stream().mapToInt(Integer::intValue).sum());
    
  }
  
  private static Predicate<Map.Entry<String, List<Integer>>> filterByPopulation(int minPopulation) {
    return kvp -> kvp.getValue().stream().mapToInt(Integer::intValue).sum() >= minPopulation;
  }
}
