package functional_programming.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Filter_by_age {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    Map<String, Integer> persons = new LinkedHashMap<>();
    
    int cnt = Integer.parseInt(reader.readLine());
    getPersons(reader, persons, cnt);
    
    String condition = reader.readLine();
    int ageLimit = Integer.parseInt(reader.readLine());
    String printType = reader.readLine();
    
    Map<String, Integer> filtred = filter(persons, condition, ageLimit);
    print(printType, filtred);
  
  }
  
  private static void getPersons(BufferedReader reader, Map<String, Integer> persons, int cnt) throws IOException {
    while (cnt-- > 0) {
      String[] inPersonsTokens = reader.readLine().split(", ");
      String name = inPersonsTokens[0];
      int age = Integer.parseInt(inPersonsTokens[1]);
      persons.put(name, age);
    }
  }
  
  private static void print(String printType, Map<String, Integer> filtred) {
    for (Map.Entry<String, Integer> map : filtred.entrySet()) {
      switch (printType) {
        case "name age":
          System.out.printf("%s - %d%n", map.getKey(), map.getValue());
          break;
        case "name":
          System.out.printf("%s%n", map.getKey());
          break;
        case "age":
          System.out.printf("%d%n", map.getValue());
          break;
      }
      
    }
  }
  
  private static Map<String, Integer> filter(Map<String, Integer> persons, String condition, int ageLimit) {
    Map<String, Integer> filtred = new LinkedHashMap<>();
    
    switch (condition) {
      case "older":
        for (Map.Entry<String, Integer> person : persons.entrySet()) {
          int personAge = person.getValue();
          if (personAge >= ageLimit) {
            filtred.put(person.getKey(), personAge);
          }
        }
        break;
      case "younger":
        for (Map.Entry<String, Integer> person : persons.entrySet()) {
          int personAge = person.getValue();
          if (personAge < ageLimit) {
            filtred.put(person.getKey(), personAge);
          }
        }
        break;
    }
    return filtred;
  }
}
