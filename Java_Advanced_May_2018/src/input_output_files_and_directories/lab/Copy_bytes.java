package input_output_files_and_directories.lab;

import java.io.*;

public class Copy_bytes {
  private final static String path = "\\src\\input_output_files_and_directories\\lab\\";
  public static void main(String[] args) {
  
    String projectPath = System.getProperty("user.dir");
    String inPath = projectPath + path + "input.txt";
    String outPath = projectPath + path + "output.txt";
  
    try (InputStream in = new FileInputStream(inPath);
         OutputStream out = new FileOutputStream(outPath)){
      
      int oneByte = 0;
      while ((oneByte = in.read()) >= 0) {
        if (oneByte == ' ' || oneByte == '\n') {
          out.write(oneByte);
        } else {
          String digits = String.valueOf(oneByte);
          for (int i = 0; i < digits.length(); i++) {
            out.write(digits.charAt(i));
          }
        }
      }
    
    } catch (IOException e) {
      e.printStackTrace();
    }
  
  }
}
