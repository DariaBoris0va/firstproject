package borisova.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class T3 {
    public static void main(String[] args) {
        HashMap<String, Integer> persons = new HashMap<>(3);
        persons.put("Dasha", 200);
        persons.put("Raul", 839);
        persons.put("Itgenik", 842);
        persons.entrySet().removeIf(y -> (y.getValue() < 500));
        System.out.println(persons);
    }
}