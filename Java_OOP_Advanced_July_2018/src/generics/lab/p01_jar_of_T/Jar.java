package generics.lab.p01_jar_of_T;

import java.util.ArrayDeque;

public class Jar<T> {
  private ArrayDeque<T> list;
  
  public Jar() {
    this.list = new ArrayDeque<T>();
  }
  
  public void add(T element) {
    this.list.addLast(element);
  }
  
  public T remove() {
    if (!this.list.isEmpty()){
      return this.list.removeLast();
    }
    return null;
  }
}
