package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Unique_usernames {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    int cnt = Integer.parseInt(reader.readLine());
    Set<String> names = new LinkedHashSet<>();
    
    addNames(reader, cnt, names);
    printUniqueNames(names);
  }
  
  private static void printUniqueNames(Set<String> names) {
    for (String name : names) {
      System.out.println(name);
    }
  }
  
  private static void addNames(BufferedReader reader, int cnt, Set<String> names) throws IOException {
    while (cnt-- > 0) {
      String name = reader.readLine();
      names.add(name);
    }
  }
}
