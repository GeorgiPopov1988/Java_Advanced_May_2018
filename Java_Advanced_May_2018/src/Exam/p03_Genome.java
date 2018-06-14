package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03_Genome {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    String inLine = reader.readLine();
  
    Map<String, Integer> genomes = new HashMap<>();
    Pattern pattern = Pattern.compile("([\\w!@#$?]+)(?==)=([0-9]+)(?=--)--([0-9]+)(?=<<)<<([a-z]+)");
  
    while (!"Stop!".equalsIgnoreCase(inLine)) {
      boolean isGenome = false;
  
      Matcher matchGenome = pattern.matcher(inLine);
  
      Pattern pattern1 = Pattern.compile("[a-z]+");
  
      isGenome = checkForGenome(isGenome, matchGenome, pattern1);
  
      fillGenomes(isGenome, matchGenome, genomes);
  
      inLine = reader.readLine();
    }
  
    sortAndPrint(genomes);
  
  }
  
  public static boolean checkForGenome(boolean isGenome, Matcher matchGenome, Pattern pattern1) {
    if (matchGenome.find()) {
      int len = Integer.parseInt(matchGenome.group(2));

      String genomeName = matchGenome.group(1);

      Matcher matchName = pattern1.matcher(genomeName);

      StringBuilder name = new StringBuilder();
      if (matchName.find()){
        name.append(matchName.group());
        while (matchName.find()) {
          name.append(matchName.group());
        }
      }
      if (name.toString().length() == len) {
        isGenome = true;
      }

    }
    return isGenome;
  }
  
  public static void fillGenomes(boolean isGenome, Matcher matchGenome, Map<String, Integer> genomes) {
    if (isGenome){
      String type = matchGenome.group(4);
      int genomesCnt = Integer.parseInt(matchGenome.group(3));
      if (!genomes.containsKey(type)) {
        genomes.put(type, 0);
      }
      int add = genomes.get(type);
      genomes.put(type, add + genomesCnt);
    }
  }
  
  public static void sortAndPrint(Map<String, Integer> genomes) {
    genomes.entrySet().stream().sorted((g1, g2) -> Integer.compare(g2.getValue(), g1.getValue()))
            .forEach(g -> System.out.printf("%s has genome size of %d%n", g.getKey(), g.getValue()));
  }
}
