package borisova.hashsets;

import java.util.HashSet;

public class Pets {
    public static void main(String[] args) {
        HashSet <String> cats= new HashSet<>();
        cats.add("Lola");
        cats.add("Luna");
        cats.add("Cloe");
        HashSet <String> dogs= new HashSet<>();
        dogs.add("Bob");
        dogs.add("Kylo");
        dogs.add("Fluff");
        System.out.println(cats);
        System.out.println(dogs);
    }
    public void printParts(HashSet<String> cats, HashSet<String> dogs){
        System.out.println(cats);
    }
}
