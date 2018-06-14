package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix_shuffling {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    String[] size = reader.readLine().split(" ");
    int rows = Integer.parseInt(size[0]);
    int cols = Integer.parseInt(size[1]);
    String[][] matrix = fillMatrix(reader, rows, cols);
  
    String line = reader.readLine();
    while (!"END".equals(line)) {
      
      try {
        String[] command = line.split(" ");
  
        if (!"swap".equals(command[0]) && command.length != 5) {
          System.out.println("Invalid input!");
        } else {
          swap(matrix, command);
          prit(matrix);
        }
      } catch (IndexOutOfBoundsException | NumberFormatException e) {
        System.out.println("Invalid input!");
      }
      line = reader.readLine();
    }
  }
  
  private static void swap(String[][] matrix, String[] command) {
    int row1 = Integer.parseInt(command[1]);
    int col1 = Integer.parseInt(command[2]);
    int row2 = Integer.parseInt(command[3]);
    int col2 = Integer.parseInt(command[4]);
    
    String temp = matrix[row1][col1];
    matrix[row1][col1] = matrix[row2][col2];
    matrix[row2][col2] = temp;
  }
  
  private static void prit(String[][] matrix) {
    for (String[] strings : matrix) {
      StringBuilder stringBuilder = new StringBuilder();
      for (String cell : strings) {
        stringBuilder.append(cell).append(" ");
      }
      System.out.println(stringBuilder.toString().trim());
    }
  }
  
  private static String[][] fillMatrix(BufferedReader reader, int rows, int cols) throws IOException {
    String[][] matrix = new String[rows][cols];
    for (int row = 0; row < rows; row++) {
      String[] inputLine = reader.readLine().split(" ");
      for (int col = 0; col < cols; col++) {
        matrix[row][col] = inputLine[col];
      }
    }
    return matrix;
  }
}
