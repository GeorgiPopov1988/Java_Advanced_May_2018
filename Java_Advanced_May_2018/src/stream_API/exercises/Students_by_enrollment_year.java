package stream_API.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Students_by_enrollment_year {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String inLine = reader.readLine();
    Map<String, List<Integer>> result = new LinkedHashMap<>();
    
    while (!"END".equals(inLine)) {
      
      String[] inTokens = inLine.split(" ");
      String number = inTokens[0];
      
      if (number.endsWith("14") || number.endsWith("15")) {
        result.putIfAbsent(number, new ArrayList<>());
        for (int i = 1; i < inTokens.length; i++) {
          result.get(number).add(Integer.valueOf(inTokens[i]));
        }
      }
      
      inLine = reader.readLine();
    }
    //for (Map.Entry<String, List<Integer>> map : result.entrySet()) {
    //  List<Integer> some = map.getValue();
    //  System.out.println(some.toString().replaceAll("[\\[\\],]", ""));
    //}
    result.forEach((key, value) -> System.out.println(value.toString().replaceAll("[\\[\\],]", "")));
  
  }
}
