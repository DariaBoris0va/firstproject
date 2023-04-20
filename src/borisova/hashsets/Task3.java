package borisova.hashsets;

import java.util.TreeSet;

public class Task3 {
        public static void main(String[] args) {
            TreeSet<Integer> numbers=new TreeSet<>();
            numbers.add(2);
            numbers.add(8);
            numbers.add(29);
            numbers.add(3);
            numbers.add(1);
            numbers.add(48);
            numbers.add(5);
            numbers.add(9);
            numbers.add(7);
            numbers.add(62);
            System.out.println(numbers);
            numbers.pollLast();
            numbers.pollFirst();
            System.out.println(numbers);
        }
    }

