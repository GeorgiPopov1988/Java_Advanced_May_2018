package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix_of_polindromes {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line = reader.readLine().split(" ");
    int rows = Integer.parseInt(line[0]);
    int cols = Integer.parseInt(line[1]);
  
    String[][] matrix = new String[rows][cols];
    
    fillTheMatrix(rows, cols, matrix);
  
    printTheMatrix(matrix);
    
  }
  
  private static void printTheMatrix(String[][] matrix) {
    for (String[] strings : matrix) {
      for (String string : strings) {
        System.out.print(string + " ");
      }
      System.out.println();
    }
  }
  
  private static void fillTheMatrix(int rows, int cols, String[][] matrix) {
    for (int row = 0; row < rows; row++) {
  
      for (int col = 0; col < cols; col++) {
        StringBuilder sb = new StringBuilder();
        sb.append((char)(row + 97));
        sb.append((char)(row + col + 97));
        sb.append((char)(row + 97));
        matrix[row][col] = sb.toString();
      }
    }
  }
}
