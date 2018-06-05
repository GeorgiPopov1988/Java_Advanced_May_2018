package functional_programming.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class Predicate_for_names {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int length = Integer.parseInt(reader.readLine());
    String[] names = reader.readLine().split(" ");
    
    Predicate<String> checkName = n -> n.length() <= length;
  
    for (String name : names) {
      if (checkName.test(name)) {
        System.out.println(name);
      }
    }
    
  }
}
