package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02_Snake {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    int length = 1;
    int row = 0;
    int col = 0;
    
    int size = Integer.parseInt(reader.readLine());
    String[][] matrix = new String[size][size];
    
    String[] commands = reader.readLine().split(", ");
    
    for (int i = 0; i < size; i++) {
      String[] inLineTokens = reader.readLine().split(" ");
      
      for (int j = 0; j < size; j++) {
        
        matrix[i][j] = inLineTokens[j];
        if (inLineTokens[j].equals("s")) {
          row = i;
          col = j;
        }
      }
    }
    
    for (String command : commands) {
      String temp = "s";
      
      switch (command) {
        case "up":
          //temp = matrix[row][col];
          row = moveUp(row, col, size, matrix);
          break;
        
        case "down":
          //temp = matrix[row][col];
          row = moveDown(row, col, size, matrix);
          break;
        
        case "right":
          //temp = matrix[row][col];
          col = moveRight(row, col, size, matrix);
          break;
        
        case "left":
          //temp = matrix[row][col];
          col = moveLeft(row, col, size, matrix);
          break;
      }
      
      switch (matrix[row][col]) {
        case "f":
          length++;
          matrix[row][col] = temp;
          break;
        case "e":
          System.out.println("You lose! Killed by an enemy!");
          return;
        default:
          matrix[row][col] = temp;
          break;
      }
    }
    
    int cnt = 0;
    boolean youLose = false;
    for (String[] strings : matrix) {
      for (String string : strings) {
        if ("f".equals(string)) {
          cnt++;
          youLose = true;
        }
      }
    }
    if (youLose) {
      System.out.printf("You lose! There is still %d food to be eaten.", cnt);
    } else {
      System.out.printf("You win! Final snake length is %d", length);
    }
    
    
  }
  
  public static int moveLeft(int row, int col, int size, String[][] matrix) {
    matrix[row][col] = "*";
    if (col - 1 < 0) {
      col = size - 1;
    } else {
      col = col - 1;
    }
    return col;
  }
  
  public static int moveRight(int row, int col, int size, String[][] matrix) {
    matrix[row][col] = "*";
    if (col + 1 > size - 1) {
      col = 0;
    } else {
      col = col + 1;
    }
    return col;
  }
  
  public static int moveDown(int row, int col, int size, String[][] matrix) {
    matrix[row][col] = "*";
    if (row + 1 > size - 1) {
      row = 0;
    } else {
      row = row + 1;
    }
    return row;
  }
  
  public static int moveUp(int row, int col, int size, String[][] matrix) {
    matrix[row][col] = "*";
    if (row - 1 < 0) {
      row = size - 1;
    } else {
      row = row - 1;
    }
    return row;
  }
}
