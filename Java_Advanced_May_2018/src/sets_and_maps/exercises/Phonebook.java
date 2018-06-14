package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    Map<String, String> phonebook = new HashMap<>();
    String line = reader.readLine();
  
    addContacts(reader, phonebook, line);
    searchContact(reader, phonebook);
    
  }
  
  private static void searchContact(BufferedReader reader, Map<String, String> phonebook) throws IOException {
    String line;
    line = reader.readLine();
    while (!"stop".equals(line)) {
      if (!phonebook.containsKey(line)) {
        System.out.printf("Contact %s does not exist.%n", line);
      } else {
        System.out.printf("%s -> %s%n", line, phonebook.get(line));
      }
      line = reader.readLine();
    }
  }
  
  private static void addContacts(BufferedReader reader, Map<String, String> phonebook, String line) throws IOException {
    while (!"search".equals(line)) {
      String[] inputTokens = line.split("-");
      String name = inputTokens[0];
      String number = inputTokens[1];
      phonebook.put(name, number);
      line = reader.readLine();
    }
  }
}
