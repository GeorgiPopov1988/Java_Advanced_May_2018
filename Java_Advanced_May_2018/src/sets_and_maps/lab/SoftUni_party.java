package sets_and_maps.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class SoftUni_party {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    Set<String> guests = new TreeSet<>();
    String input = reader.readLine();
    guestsList(reader, guests, input);
    input = reader.readLine();
    inCommingGuests(reader, guests, input);
  
    print(guests);
  }
  
  private static void print(Set<String> guests) {
    System.out.println(guests.size());
    for (String guest : guests) {
      System.out.println(guest);
    }
  }
  
  private static void inCommingGuests(BufferedReader reader, Set<String> guests, String input) throws IOException {
    while (!"END".equals(input)) {
      guests.remove(input);
      input = reader.readLine();
    }
  }
  
  private static void guestsList(BufferedReader reader, Set<String> guests, String input) throws IOException {
    while (!"PARTY".equals(input)) {
      guests.add(input);
      input = reader.readLine();
    }
  }
}
