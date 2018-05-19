package linear_structures.lab.arrays_and_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split_by_word_casing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    List<String> lowerCase = new ArrayList<>();
    List<String> upperCase = new ArrayList<>();
    List<String> mixCase = new ArrayList<>();
    
    String[] words = scanner.nextLine().split("[\\\\, ;:.!()\"'/\\[\\] ]+");
    
    for (String word : words) {
      if (isLowerCase(word) && !word.isEmpty()) {
        lowerCase.add(word);
      } else if (isUpperCase(word) && !word.isEmpty()) {
        upperCase.add(word);
      } else if (!word.isEmpty()){
        mixCase.add(word);
      }
    }
    System.out.println("Lower-case: "+String.join(", ",lowerCase));
    System.out.println("Mixed-case: "+String.join(", ",mixCase));
    System.out.println("Upper-case: "+String.join(", ",upperCase));
    
  }
  
  private static boolean isUpperCase(String word) {
    final String regex = "\\b[A-Z]+\\b";
    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    final Matcher matcher = pattern.matcher(word);
  
    return matcher.matches();
  
  }
  
  private static boolean isLowerCase(String word) {
    final String regex = "\\b[a-z]+\\b";
    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    final Matcher matcher = pattern.matcher(word);
  
    return matcher.matches();
  
  }
}
