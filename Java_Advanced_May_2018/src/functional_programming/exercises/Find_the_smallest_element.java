package functional_programming.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Find_the_smallest_element {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    int[] numbers = Arrays
            .stream(reader.readLine()
            .split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();
  
    int index = getIndex(numbers);
    System.out.println(index);
  }
  
  private static int getIndex(int[] numbers) {
    int min = Integer.MAX_VALUE;
    int index = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] <= min) {
        min = numbers[i];
        index = i;
      }
    }
    return index;
  }
}
