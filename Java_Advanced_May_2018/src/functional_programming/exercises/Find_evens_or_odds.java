package functional_programming.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Find_evens_or_odds {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int start = scanner.nextInt();
    int end = scanner.nextInt();
    scanner.nextLine();
    String type = scanner.nextLine();
    Predicate<Integer> getEven = n -> n  % 2 == 0;
    // Predicate<Integer> getodd = n -> n  % 2 != 0;
    Predicate<Integer> getOdd = getEven.negate();
    List<Integer> result = new ArrayList<>();
    
    switch (type) {
      case "odd":
        for (int i = start; i <= end; i++) {
          if (getOdd.test(i)) {
            result.add(i);
          }
        }
        break;
      case "even":
        for (int i = start; i <= end; i++) {
          if (getEven.test(i)) {
            result.add(i);
          }
        }
        break;
    }
    System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
  }
}
