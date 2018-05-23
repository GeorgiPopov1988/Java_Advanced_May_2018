package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Fix_emails {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    Map<String, String> emails = new LinkedHashMap<>();
    String name = reader.readLine();
  
    addEmails(reader, emails, name);
    print(emails);
  
  }
  
  private static void print(Map<String, String> emails) {
    for (Map.Entry<String, String> map : emails.entrySet()) {
      System.out.printf("%s -> %s%n", map.getKey(), map.getValue());
    }
  }
  
  private static void addEmails(BufferedReader reader, Map<String, String> emails, String name) throws IOException {
    while (!"stop".equals(name)) {
      String email = reader.readLine();
      if (!email.toLowerCase().endsWith("us")
              && !email.toLowerCase().endsWith("uk")
              && !email.toLowerCase().endsWith("com")) {
        emails.put(name, email);
      }
      name = reader.readLine();
    }
  }
}
