package generics.lab.p02_array_creator;

public class Main {
  public static void main(String[] args) {
  
    Object[] strings = ArrayCreator.create(5, "items");
    Integer[] ints = ArrayCreator.create(Integer.class, 5, 1);
  
  }
}
