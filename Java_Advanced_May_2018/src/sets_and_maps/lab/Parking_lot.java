package sets_and_maps.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Parking_lot {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Set<String> parking = new HashSet<>();
    
    String input = reader.readLine();
    while (!"END".equals(input)) {
      String[] tokens = input.split(", ");
      String command = tokens[0];
      String car = tokens[1];
      
      makeChanges(parking, command, car);
      
      input = reader.readLine();
    }
    
    print(parking);
    
  }
  
  private static void print(Set<String> parking) {
    if (parking.isEmpty()) {
      System.out.println("Parking Lot is Empty");
    } else {
      for (String car : parking) {
        System.out.println(car);
      }
    }
  }
  
  private static void makeChanges(Set<String> parking, String command, String car) {
    switch (command) {
      case "IN":
        parking.add(car);
        break;
      case "OUT":
        parking.remove(car);
        break;
    }
  }
}
