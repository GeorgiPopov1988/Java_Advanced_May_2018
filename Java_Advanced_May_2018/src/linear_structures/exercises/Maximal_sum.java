package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximal_sum {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String[] size = reader.readLine().split(" ");
    int rows = Integer.parseInt(size[0]);
    int cols = Integer.parseInt(size[1]);
    int[][] matrix = new int[rows][cols];
  
    fillTheMatrix(reader, matrix, rows, cols);
    int startRowIndex = 0;
    int startColIndex = 0;
  
    int maxSum = Integer.MIN_VALUE;
    for (int row = 0; row < rows - 2; row++) {
      int sum = 0;
      for (int col = 0; col < cols - 2; col++) {
        // System.out.println();
        int currentRowSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2];
        int nextRowSum = matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2];
        int thirdRowSum = matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
        sum = currentRowSum + nextRowSum + thirdRowSum;
        if (sum > maxSum) {
          maxSum = sum;
          startRowIndex = row;
          startColIndex = col;
        }
      }
    }
    printResult(matrix, startRowIndex, startColIndex, maxSum);
  }
  
  private static void printResult(int[][] matrix, int startRowIndex, int startColIndex, int maxSum) {
    System.out.println("Sum = " + maxSum);
  
    for (int row = startRowIndex; row < startRowIndex + 3; row++) {
      StringBuilder stringBuilder = new StringBuilder();
      for (int col = startColIndex; col < startColIndex + 3; col++) {
        stringBuilder.append(matrix[row][col]);
        if (col < startColIndex + 2) {
          stringBuilder.append(" ");
        }
      }
      System.out.println(stringBuilder.toString());
    }
  }
  
  private static void fillTheMatrix(BufferedReader reader, int[][] matrix, int rows, int cols) throws IOException {
    for (int row = 0; row < rows; row++) {
      String[] line = reader.readLine().split(" ");
      for (int col = 0; col < cols; col++) {
        matrix[row][col] = Integer.parseInt(line[col]);
        
      }
    }
  }
}
