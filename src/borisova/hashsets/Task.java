package borisova.hashsets;

import java.util.LinkedHashSet;

public class Task {
    public static void main(String[] args) {
        LinkedHashSet <String> states = new LinkedHashSet<>();
        states.add("California");
        states.add("Florida");
        states.add("New York");
        states.add("Ohio");
        states.add("Washington D.C.");
        System.out.println(states);
    }
}
