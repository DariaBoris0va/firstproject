package borisova.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(10000);
        Scanner scanner = new Scanner(System.in);
        for (Integer i : arr){
            arr.add(i, scanner.nextInt());
        }
    }
}
