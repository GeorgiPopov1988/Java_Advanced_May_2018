package linear_structures.lab.arrays_and_lists;

import java.util.Scanner;

public class Maximum_sum_of_2x2_submatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    String[] matrixSize = scanner.nextLine().split(", ");
    int rows = Integer.parseInt(matrixSize[0]);
    int cols = Integer.parseInt(matrixSize[1]);
    int[][] matrix = new int[rows][cols];
    
    createMatrix(scanner, rows, cols, matrix);
  
    int maxSum = Integer.MIN_VALUE;
    String rowBestIndex = "";
    String colBestindex = "";
    
    for (int row = 0; row < rows - 1; row++) {
  
      for (int col = 0; col < cols - 1; col++) {
        int currentRowSum = matrix[row][col] + matrix[row][col + 1];
        int nextRowSum = matrix[row + 1][col] + matrix[row + 1][col + 1];
        int sum = currentRowSum + nextRowSum;
        if (sum > maxSum) {
          maxSum = sum;
          rowBestIndex = String.valueOf(matrix[row][col]) + " " + String.valueOf(matrix[row][col + 1]);
          colBestindex = String.valueOf(matrix[row + 1][col]) + " " + String.valueOf(matrix[row + 1][col + 1]);
        }
      }
    }
    System.out.printf("%s%n%s%n%s%n", rowBestIndex, colBestindex, maxSum);
  }
  private static void createMatrix(Scanner scanner, int rows, int cols, int[][] matrix) {
    for (int row = 0; row < rows; row++) {
      String[] inputNumbers = scanner.nextLine().split(", ");
      for (int col = 0; col < cols; col++) {
        matrix[row][col] = Integer.parseInt(inputNumbers[col]);
      }
    }
  }
}
