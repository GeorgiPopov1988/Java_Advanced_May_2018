package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Fill_the_matrix {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] line = reader.readLine().split(", ");
    int length = Integer.parseInt(line[0]);
    String type = line[1];
    int[][] matrix = new int[length][length];
    int counter = 1;
    
    switch (type) {
      case "A":
        fillMatrixTypeA(matrix, counter);
        break;
      case "B":
        fillMatrixTypeB(matrix, counter);
        break;
    }
  
    for (int col = 0; col < matrix.length; col++) {
      for (int row = 0; row < matrix.length; row++) {
        System.out.print(matrix[row][col] + " ");
      }
      System.out.println();
    }
    
  }
  
  private static void fillMatrixTypeB(int[][] matrix, int counter) {
    for (int col = 0; col < matrix.length; col++) {
      if (col % 2 == 0) {
        // fill the column from up to down
        for (int row = 0; row < matrix.length; row++) {
          matrix[col][row] = counter;
          counter++;
        }
      } else {
        // fill the column from down to up
        for (int row = matrix.length - 1; row >= 0; row--) {
          matrix[col][row] = counter++;
        }
      }
    }
  }
  
  private static void fillMatrixTypeA(int[][] matrix, int counter) {
    for (int col = 0; col < matrix.length; col++) {
      for (int row = 0; row < matrix.length; row++) {
        matrix[col][row] = counter;
        counter++;
      }
    }
  }
}
