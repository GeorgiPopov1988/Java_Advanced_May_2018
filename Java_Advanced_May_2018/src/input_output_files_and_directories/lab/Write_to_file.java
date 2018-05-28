package input_output_files_and_directories.lab;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Write_to_file {
  private final static String path = "\\src\\input_output_files_and_directories\\lab\\";
  
  public static void main(String[] args) {
    
    String projectPath = System.getProperty("user.dir");
    String inputPath = projectPath + path + "input.txt";
    String outputFilePath = projectPath + path + "output.txt";
  
    List<Character> symbols = new ArrayList<>();
    Collections.addAll(symbols, '.', ',', '!', '?');
  
    try (InputStream in = new FileInputStream(inputPath);
         OutputStream out = new FileOutputStream(outputFilePath)) {
      int oneByte = 0;
      while ((oneByte = in.read()) >= 0) {
        if (!symbols.contains((char)oneByte)) {
          out.write(oneByte);
        }
      }
    
    } catch (IOException e) {
      e.printStackTrace();
    }
  
  }
}
