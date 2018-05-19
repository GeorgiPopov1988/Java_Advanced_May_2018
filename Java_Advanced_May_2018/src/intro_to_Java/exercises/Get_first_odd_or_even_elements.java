package intro_to_Java.exercises;

import java.util.*;

public class Get_first_odd_or_even_elements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
            .mapToInt(Integer::parseInt).toArray();
    
    String[] tokens = scanner.nextLine().split("\\s+");
    int max = Integer.parseInt(tokens[1]);
    String command = tokens[2];
    List<Integer> result = getNumbers(numbers, max, command);
    System.out.println(result.toString().replace("[", "")
            .replace("]", "")
            .replace(",", ""));
  }
  
  private static List<Integer> getNumbers(int[] numbers, int max, String command) {
    List<Integer> result = new ArrayList<>();
    switch (command) {
      case "odd":
        result = getOddNumbers(numbers, max);
        break;
      case "even":
        result = getEvenNumbers(numbers, max);
        break;
    }
    return result;
  }
  
  private static List<Integer> getEvenNumbers(int[] numbers, int max) {
    List<Integer> even = new ArrayList<>();
    int cnt = 0;
    for (int number : numbers) {
      if (number % 2 == 0) {
        if (cnt < max) {
          even.add(number);
          cnt++;
        }
      }
    }
    return even;
  }
  
  private static List<Integer> getOddNumbers(int[] numbers, int max) {
    List<Integer> odd = new ArrayList<>();
    int cnt = 0;
    for (int number : numbers) {
      if (number % 2 != 0) {
        if (cnt < max) {
          odd.add(number);
          cnt++;
        }
      }
    }
    return odd;
  }
}
