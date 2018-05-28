package input_output_files_and_directories.lab;

import java.io.FileInputStream;
import java.io.IOException;

public class Read_file {
  private final static String path = "\\src\\input_output_files_and_directories\\lab\\";
  public static void main(String[] args) {
    //String path1 =
    //        "C:\\Users\\georg\\IdeaProjects\\Java_Fundamentals_May_2018\\" +
    //                "Java_Advanced_May_2018\\src\\input_output_files_and_directories\\lab\\input.txt";
    
    String projectPath = System.getProperty("user.dir");
    String inputFilePath = projectPath + path + "input.txt";
    String outputFilePath = projectPath + path + "output.txt";
    
    System.out.println(inputFilePath);
    System.out.println(inputFilePath);
  
    try {
      FileInputStream fis = new FileInputStream(inputFilePath);
      int oneByte = fis.read();
      while (oneByte >= 0) {
        String binariStr = Integer.toBinaryString(oneByte);
        System.out.printf("%s ", binariStr);
      }
    
      oneByte = fis.read();
    } catch (IOException e) {
      System.out.println("Problem");;
    }
  }
}
