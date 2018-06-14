package linear_structures.lab.arrays_and_lists;

import java.util.Arrays;
import java.util.Scanner;

public class Encrypt_sort_and_print_Array {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int strCount = Integer.parseInt(scanner.nextLine());
    int[] result = new int[strCount];
    
    for (int j = 0; j < strCount; j++) {
      String word = scanner.nextLine();
      int sum = 0;
      
      for (int i = 0; i < word.length(); i++) {
        if (isVowel(word.charAt(i))) {
          sum += word.charAt(i) * word.length();
        } else {
          sum += word.charAt(i) / word.length();
        }
      }
      result[j] = sum;
    }
    Arrays.sort(result);
    for (int num : result) {
      System.out.println(num);
    }
  }
  
  private static boolean isVowel(char letter) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    
    for (char vowel : vowels) {
      if (vowel == Character.toLowerCase(letter)) {
        return true;
      }
    }
    
    return false;
  }
}