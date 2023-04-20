package borisova.hashmaps;

import java.util.HashMap;

public class T2 {
    public static void main(String[] args) {
        HashMap<Integer, String> people= new HashMap<>();
        people.put(1,"Mike");
        people.put(2,"Sam");
        people.put(3,"Jenna");
        people.put(4,"Lauren");
        System.out.println(people.size());
    }
}
