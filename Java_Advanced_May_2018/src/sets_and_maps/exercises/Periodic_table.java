package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Periodic_table {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int cnt = Integer.parseInt(reader.readLine());
    Set<String> elements = new TreeSet<>();
    
    while (cnt-- > 0) {
      String[] in = reader.readLine().split(" ");
      for (String element : in) {
        elements.add(element);
      }
    }
    for (String element : elements) {
      System.out.print(element + " ");
    }
    
    
  }
}
