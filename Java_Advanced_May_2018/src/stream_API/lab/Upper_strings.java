package stream_API.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Upper_strings {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    List<String> words = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toList());
    words.stream().map(w -> w.toUpperCase())
            .forEach(s -> System.out.print(s + " "));
    
    
    
  }
}
