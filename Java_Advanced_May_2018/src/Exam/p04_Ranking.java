package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class p04_Ranking {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String inLine = reader.readLine();
    Map<String, String> contests = new LinkedHashMap<>();
    addContests(reader, inLine, contests);
  
    inLine = reader.readLine();
    Map<String, Map<String, Integer>> results = addUsers(reader, inLine, contests);
  
  
    printBestUser(results);
    printResult(results);
    
    
  }
  
  public static void printResult(Map<String, Map<String, Integer>> results) {
    StringBuilder result = new StringBuilder();
    result.append("Ranking: ").append(System.lineSeparator());
    for (Map.Entry<String, Map<String, Integer>> users : results.entrySet()) {
      result.append(users.getKey()).append(System.lineSeparator());
      
      users.getValue().entrySet().stream().sorted((p1, p2) -> Integer.compare(p2.getValue(), p1.getValue()))
              .forEach(s -> result.append(String.format("#  %s -> %d%n", s.getKey(), s.getValue())));
      
    }
    System.out.println(result.toString());
  }
  
  public static void printBestUser(Map<String, Map<String, Integer>> results) {
    int biggestSum = 0;
    String bestUser = "";
    
    for (Map.Entry<String, Map<String, Integer>> user : results.entrySet()) {
      int sum = 0;
      for (Map.Entry<String, Integer> userContests : user.getValue().entrySet()) {
        sum += userContests.getValue();
      }
      if (sum > biggestSum) {
        biggestSum = sum;
        bestUser = user.getKey();
      }
    }
    System.out.printf("Best candidate is %s with total %d points.%n", bestUser, biggestSum);
  }
  
  public static Map<String, Map<String, Integer>> addUsers(BufferedReader reader, String inLine
                  , Map<String, String> contests) throws IOException {
  
    Map<String, Map<String, Integer>> results = new TreeMap<>();
    while (!"end of submissions".equals(inLine)) {
      // {contest}=>{password}=>{username}=>{points}
      String[] userTokens = inLine.split("=>");
      String contest = userTokens[0];
      String password = userTokens[1];
      String userName = userTokens[2];
      int points = Integer.parseInt(userTokens[3]);
    
      if (contestIsValid(contest, password, contests)) {
      
        if (!results.containsKey(userName)) {
          results.put(userName, new HashMap<>());
        }
        if (!results.get(userName).containsKey(contest)) {
          results.get(userName).put(contest, points);
        }

        if (results.get(userName).containsKey(contest)) {
          int test = results.get(userName).get(contest);
         
          if (test < points){
            results.get(userName).put(contest, points);
          }
        }
      }
    
    
      inLine = reader.readLine();
    }
    return results;
  }
  
  
  public static void addContests(BufferedReader reader, String inLine, Map<String, String> contests) throws IOException {
    while (!"end of contests".equals(inLine)) {
      // {contest}:{password for contest}
      String[] contestTokens = inLine.split(":");
      String contest = contestTokens[0];
      String password = contestTokens[1];
      
      contests.putIfAbsent(contest, password);
      
      inLine = reader.readLine();
    }
  }
  
  private static boolean contestIsValid(String contest, String password, Map<String, String> contests) {
    if (contests.containsKey(contest) && contests.get(contest).equals(password)) {
      return true;
    }
    return false;
  }
  
}
