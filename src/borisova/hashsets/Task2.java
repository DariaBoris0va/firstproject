package borisova.hashsets;

import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashSet <Integer> numbers= new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.contains(a)) {
                System.out.println("This number is in the HashSet");
            }
            else {
                System.out.println("This number is NOT in the HashSet");
            }
        }
    }
}
