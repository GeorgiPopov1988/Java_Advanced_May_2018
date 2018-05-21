package sets_and_maps.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Academy_graduation {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    int studentsCnt = Integer.parseInt(reader.readLine());
  
    Map<String, Double[]> box = new TreeMap<>();
    for (int i = 0; i < studentsCnt; i++) {
      String studentName = reader.readLine();
      String[] strScores = reader.readLine().split(" ");
      Double[] scores = new Double[strScores.length];
    
      for (int j = 0; j < scores.length; j++) {
        scores[j] = Double.parseDouble(strScores[j]);
      }
    
      box.put(studentName, scores);
    }
  
  
    for (String name : box.keySet()) {
      double sum = 0;
      Double[] score = box.get(name);
      for (Double aDouble : score) {
        sum += aDouble;
      }
      double average = sum / score.length;
      System.out.printf("%s is graduated with %s%n", name, average);
    }
    
    
    
    
  }
}
