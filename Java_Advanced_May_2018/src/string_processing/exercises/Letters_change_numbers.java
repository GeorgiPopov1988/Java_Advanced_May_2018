package string_processing.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Letters_change_numbers {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String[] input = reader.readLine().split("\\s+");
    double result = getResult(input);
  
  
    System.out.printf("%.2f", result);
  }
  
  private static double getResult(String[] input) {
    double result = 0.0d;
    for (int i = 0; i < input.length; i++) {
      String current = input[i];
      double num = Double.parseDouble(String.valueOf(current.substring(1, current.length() - 1)));
      double sum = 0.0d;
      char firstLet = current.charAt(0);
      char lastLet = current.charAt(current.length() - 1);
      double firstPosition = 0;
      double lastPosition = 0;
  
      sum = checkFirstLetter(num, sum, firstLet);
      sum = checkLastLetter(sum, lastLet);
  
      result += sum;
    }
    return result;
  }
  
  private static double checkLastLetter(double sum, char lastLet) {
    int lastPosition;
    if (Character.isLetter(lastLet) && Character.isUpperCase(lastLet)) {
      lastPosition = (int) lastLet - 64;
      sum -= lastPosition;
    } else if (Character.isLetter(lastLet) && Character.isLowerCase(lastLet)) {
      lastPosition = (int) lastLet - 96;
      sum += lastPosition;
    }
    return sum;
  }
  
  private static double checkFirstLetter(double num, double sum, char firstLet) {
    int firstPosition;
    if (Character.isLetter(firstLet) && Character.isUpperCase(firstLet)) {
      firstPosition = (int) firstLet - 64;
      sum += num / firstPosition;
      
    } else if (Character.isLetter(firstLet) && Character.isLowerCase(firstLet)) {
      firstPosition = (int) firstLet - 96;
      sum += num * firstPosition;
    }
    return sum;
  }
}
