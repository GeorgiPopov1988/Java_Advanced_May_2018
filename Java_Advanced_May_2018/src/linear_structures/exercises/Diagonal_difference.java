package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diagonal_difference {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    int lenght = Integer.parseInt(reader.readLine());
    int[][] matrix = new int[lenght][lenght];
  
    fillTheMatrix(reader, matrix);
  
    int difference = getDifference(matrix);
  
    System.out.println(difference);
    
  }
  
  private static int getDifference(int[][] matrix) {
    int primaryDiagonalSum = 0;
    int secondaryDiagonalSum = 0;
    int difference = 0;
    
    for (int i = 0; i < matrix.length; i++) {
      int row = i;
      primaryDiagonalSum += matrix[row][i];
      secondaryDiagonalSum += matrix[row][matrix.length - 1 - i];
      difference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }
    return difference;
  }
  
  private static void fillTheMatrix(BufferedReader reader, int[][] matrix) throws IOException {
    for (int row = 0; row < matrix.length; row++) {
      String[] line = reader.readLine().split(" ");
      for (int col = 0; col < matrix.length; col++) {
        matrix[row][col] = Integer.parseInt(line[col]);
      
      }
    }
  }
}
