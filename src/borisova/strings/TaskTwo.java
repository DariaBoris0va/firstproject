package borisova.strings;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i]=scanner.next();
            System.out.println(str[i]);
        }

    }
}