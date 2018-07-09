package generics.lab.p01_jar_of_T;

public class Main {

    public static void main(String[] args) {
        Jar<Pickle> pickles = new Jar<Pickle>();
        pickles.add(new Pickle());
        pickles.add(new Pickle());
    
        Pickle pickle = pickles.remove();
    }
}
