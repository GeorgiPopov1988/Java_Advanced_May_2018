package sets_and_maps.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets_of_elements {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String[] lengths = reader.readLine().split(" ");
    int lenOne = Integer.parseInt(lengths[0]);
    int lenTwo = Integer.parseInt(lengths[1]);
    Set<Integer> numsOne = new LinkedHashSet<>();
    Set<Integer> numsTwo = new LinkedHashSet<>();
    
    for (int i = 0; i < lenOne; i++) {
      numsOne.add(Integer.parseInt(reader.readLine()));
    }
    for (int i = 0; i < lenTwo; i++) {
      numsTwo.add(Integer.parseInt(reader.readLine()));
    }
    numsOne.retainAll(numsTwo);
    for (Integer number : numsOne) {
      System.out.print(number + " ");
    }
  }
}
