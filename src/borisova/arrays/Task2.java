package borisova.arrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        char[] a={'i','t','g','e','n','i','o'};
        Scanner scan= new Scanner(System.in);
        char input= scan.next().charAt(0);
        a[6]=input;
        for (int i=0;i<7;i++){
            System.out.print(a[i]);
        }
    }
}
