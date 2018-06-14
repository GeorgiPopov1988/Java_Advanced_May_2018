package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Population_counter {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Map<String, Long> countryesPopulation = new LinkedHashMap<>();
    Map<String, LinkedHashMap<String, Long>> citiesPopulation = new LinkedHashMap<>();
    
    String input = reader.readLine();
    while (!"report".equals(input)) {
      String[] inTokens = input.trim().split("\\|");
      String city = inTokens[0];
      String country = inTokens[1];
      long population = Long.parseLong(inTokens[2]);
  
      addInformation(countryesPopulation, citiesPopulation, city, country, population);
      
      
      input = reader.readLine();
    }
    sortAndPrintPopulations(countryesPopulation, citiesPopulation);
  
  }
  
  private static void addInformation(Map<String, Long> countryesPopulation, Map<String, LinkedHashMap<String, Long>> citiesPopulation, String city, String country, long population) {
    if (!countryesPopulation.containsKey(country)) {
      countryesPopulation.put(country, 0L);
    }
    countryesPopulation.put(country, countryesPopulation.get(country) + population);
    
    
    if (!citiesPopulation.containsKey(country)) {
      citiesPopulation.put(country, new LinkedHashMap<>());
      citiesPopulation.get(country).put(city, 0L);
    }
    if (!citiesPopulation.get(country).containsKey(city)) {
      citiesPopulation.get(country).put(city, 0L);
    }
    citiesPopulation.get(country).put(city, citiesPopulation.get(country).get(city) + population);
  }
  
  private static void sortAndPrintPopulations(Map<String, Long> countryesPopulation, Map<String, LinkedHashMap<String, Long>> citiesPopulation) {
    countryesPopulation.entrySet().stream().sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
            .forEach(x -> {
              System.out.printf("%s (total population: %d)%n", x.getKey(), x.getValue());
              citiesPopulation.get(x.getKey()).entrySet().stream().sorted((a1, a2) -> a2.getValue().compareTo(a1.getValue()))
                      .forEach(city -> {
                        System.out.printf("=>%s: %d\n", city.getKey(), city.getValue());
                      });
            });
  }
}
