package linear_structures.lab.arrays_and_lists;

import java.util.Scanner;

public class Sum_matrix_elements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String[] matrixSize = scanner.nextLine().split(", ");
    int rows = Integer.parseInt(matrixSize[0]);
    int cols = Integer.parseInt(matrixSize[1]);
    int[][] matrix = new int[rows][cols];
  
    createMatrix(scanner, rows, cols, matrix);
  
    int sum = 0;
    for (int[] ints : matrix) {
      for (int num : ints) {
        sum += num;
      }
    }
    System.out.printf("%d%n%d%n%d%n",rows, cols, sum);
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
