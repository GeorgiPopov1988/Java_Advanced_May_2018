package stream_API.lab;

import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class First_name {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    List<String> names = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toList());
    String[] chars = reader.readLine().toUpperCase().split(" ");
    List<Character> letters = new ArrayList<>();
    for (String aChar : chars) {
      letters.add(aChar.charAt(0));
    }
    
    Optional<String> result = names.stream().filter(n -> letters.contains(n.charAt(0)))
            .sorted()
            .findFirst();
    
    if (result.isPresent()) {
      System.out.println(result.get());
    } else {
      System.out.println("No match");
    }
    
  }
}
