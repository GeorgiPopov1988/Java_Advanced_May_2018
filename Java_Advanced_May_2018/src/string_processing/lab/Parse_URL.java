package string_processing.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parse_URL {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] inURL = reader.readLine().split("://");
    
    if (inURL.length != 2) {
      System.out.println("Invalid URL");
      return;
    }
    
    String protocol = inURL[0];
    System.out.println("Protocol = " + protocol);
    
    int index = inURL[1].indexOf('/');
    String server = inURL[1].substring(0, index);
    System.out.println("Server = " + server);
    
    String resources = inURL[1].substring(index + 1);
    System.out.println("Resources = " + resources);
    
  }
}
