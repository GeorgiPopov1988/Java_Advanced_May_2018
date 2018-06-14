package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01_Intership {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    int problemsCnt = Integer.parseInt(reader.readLine());
    int candidatesCnt = Integer.parseInt(reader.readLine());
    ArrayDeque<String> problems = new ArrayDeque<>();
    String inLine = "";
  
    for(int i = 0; i < problemsCnt; i++) {
      inLine = reader.readLine();
      problems.addLast(inLine);
    }
  
    ArrayDeque<String> candidates = new ArrayDeque<>();
    Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
  
  
    for (int i = 0; i < candidatesCnt; i++) {
      inLine = reader.readLine();
      Matcher matcher = pattern.matcher(inLine);
  
      if (matcher.find()) {
        String name = inLine;
        candidates.addLast(name);
      }
      
    }
  
   //Map<String, String> solved = new LinkedHashMap<>();
    while (true) {
      if (problems.isEmpty()) {
        System.out.println(String.join(", ", candidates));
        break;
      }
      if (candidates.size() == 1) {
        System.out.printf("%s gets the job!%n", candidates.getFirst());
        break;
      }
      
      String problem = problems.getLast();
      String name = candidates.getFirst();
      int problemSum = getProblemSum(problem);
      int candidateSum = getCandidateSum(name);
      
      if (candidateSum > problemSum) {
        System.out.printf("%s solved %s.%n", name, problem);
        problems.removeLast();
        candidates.removeFirst();
        candidates.addLast(name);
        
      } else {
        System.out.printf("%s failed %s.%n",name, problem );
        problems.removeLast();
        problems.addFirst(problem);
        candidates.removeFirst();
      }
      
    }
    
  }
  
  
  private static int getCandidateSum(String name) {
    int sum = 0;
    for (int i = 0; i < name.length(); i++) {
      char currentLetter = name.charAt(i);
      sum += (int)currentLetter;
    }
    
    return  sum;
  }
  
  private static int getProblemSum(String problem) {
    int sum = 0;
    for (int i = 0; i < problem.length(); i++) {
      char currentLetter = problem.charAt(i);
      sum += (int)currentLetter;
    }
    
    
    return  sum;
  }
}
