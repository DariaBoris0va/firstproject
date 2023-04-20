package borisova.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
        names.add("Josh");
        names.add("Alex");
        names.add("Maya");
        names.add("Olivia");
        System.out.println(names);
        LinkedList<Integer> age=new LinkedList<Integer>();
        age.add(20);
        age.add(23);
        age.add(12);
        age.add(19);
        System.out.println(age);
    }
}
