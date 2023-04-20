package borisova.character;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        Character b = new Character(a);
        if (b.isUpperCase(b)) {
            System.out.println("This letter is upper case");
        } else if (b.isLowerCase(b)) {
            System.out.println("This letter is lower case");
        }
    }
}
