package exam_preparation_01;

import java.util.Scanner;

public class Shockwave {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    
  
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    scanner.nextLine();
    int[][] matrix = new int[n][m];
    
    String inLine = scanner.nextLine();
    while (!"Here we go".equalsIgnoreCase(inLine)) {
      String[] inTokens = inLine.split(" ");
      int x1 = Integer.parseInt(inTokens[0]);
      int y1 = Integer.parseInt(inTokens[1]);
      int x2 = Integer.parseInt(inTokens[2]);
      int y2 = Integer.parseInt(inTokens[3]);
  
      for (int i = x1; i <= x2; i++) {
        for (int j = y1; j <= y2; j++) {
          matrix[i][j] += 1;
        }
      }
      inLine = scanner.nextLine();
    }
  
    for (int[] ints : matrix) {
      for (int num : ints) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
    
  }
}
