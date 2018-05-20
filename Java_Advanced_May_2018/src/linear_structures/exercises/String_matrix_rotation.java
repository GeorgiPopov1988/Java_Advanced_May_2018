package linear_structures.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class String_matrix_rotation {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    String[] commandTokens = reader.readLine().split("[()]");
    List<String> words = new ArrayList<>();
    
    String input = reader.readLine();
    inputWords(reader, words, input);
    
    String max = Collections.max(words, Comparator.comparing(s -> s.length()));
    
    int rows = words.size();
    int cols = max.length();
    char[][] matrix = new char[rows][cols];
    
    fillTheMatrix(words, rows, cols, matrix);
    
    int rotationsCnt = getRotateionsCnt(commandTokens[1]);
    char[][] result;
    for (int i = 0; i < rotationsCnt; i++) {
      matrix = rotateClockwise(matrix);
    }
    print(matrix);
    
  }
  
  private static char[][] rotateClockwise(char[][] matrix) {
    
    int matrixLength = matrix.length;
    int rowLength = matrix[0].length;
    
    char[][] rotated = new char[rowLength][matrixLength];
    
    for (int r = 0; r < matrixLength; r++) {
      for (int c = 0; c < rowLength; c++) {
        
        rotated[c][matrixLength - 1 - r] = matrix[r][c];
      }
    }
    
    return rotated;
  }
  
  private static void print(char[][] matrix) {
    for (char[] chars : matrix) {
      for (char letter : chars) {
        System.out.print(letter);
      }
      System.out.println();
    }
  }
  
  private static int getRotateionsCnt(String commandToken) {
    int angle = Integer.parseInt(commandToken);
    
    return angle / 90;
  }
  
  private static void fillTheMatrix(List<String> words, int rows, int cols, char[][] matrix) {
    for (int row = 0; row < rows; row++) {
      char[] currentWord = words.get(row).toCharArray();
      for (int col = 0; col < cols; col++) {
        if (col >= currentWord.length) {
          matrix[row][col] = ' ';
        } else {
          matrix[row][col] = currentWord[col];
        }
      }
    }
  }
  
  private static void inputWords(BufferedReader reader, List<String> words, String input) throws IOException {
    while (!"END".equals(input)) {
      words.add(input);
      input = reader.readLine();
    }
  }
}
