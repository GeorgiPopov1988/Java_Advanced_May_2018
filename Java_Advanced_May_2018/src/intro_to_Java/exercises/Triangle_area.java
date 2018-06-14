package intro_to_Java.exercises;

import java.util.Scanner;

public class Triangle_area {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double aX = scanner.nextDouble();
    double aY = scanner.nextDouble();
    double bX = scanner.nextDouble();
    double bY = scanner.nextDouble();
    double cX = scanner.nextDouble();
    double cY = scanner.nextDouble();
    
    //area = Ax*(By − Cy)+ Bx*(Cy−Ay)+Cx*(Ay−By) / 2
    int triangleArea = (int) (Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2));
    System.out.printf("%d", triangleArea);
  }
}
