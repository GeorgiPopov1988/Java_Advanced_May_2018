package functional_programming.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Predicate_party {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] inNames = reader.readLine().split(" ");
    List<String> names = new ArrayList<>();
    Collections.addAll(names, inNames);
    
    String input = reader.readLine();
    while (!"Party!".equals(input)) {
      String[] commandTokens = input.split(" ");
      String commandType = commandTokens[0];
      String commandOption = commandTokens[1];
      String commandLength = commandTokens[2];
      
      List<String> targets = findTarget(names, commandOption, commandLength);
      executeCommand(names, commandType, targets);
      input = reader.readLine();
    }
  
    printResult(names);
  }
  
  public static void printResult(List<String> names) {
    if (names.isEmpty()) {
      System.out.println("Nobody is going to the party!");
    } else {
      System.out.println(String.format("%s are going to the party!", String.join(", ", names)));
    }
  }
  
  public static void executeCommand(List<String> names, String commandType, List<String> targets) {
    switch (commandType) {
      case "Remove":
          names.removeAll(targets);
        break;
      case "Double":
        names.addAll(targets);
        break;
    }
  }
  
  private static List<String> findTarget(List<String> names, String commandOption, String commandLength) {
    List<String> targets = new ArrayList<>();
    for (String name : names) {
      String target = "";
      switch (commandOption) {
        case "StartsWith":
          if (name.startsWith(commandLength)) {
            target = name;
          }
          break;
        case "EndsWith":
          if (name.endsWith(commandLength)){
            target = name;
          }
          break;
        case "Length":
          if (String.valueOf(name.length()).equals(commandLength)) {
            target = name;
          }
          break;
      }
      if (!target.isEmpty()) {
        targets.add(target);
      }
    }
    return targets;
  }
}
