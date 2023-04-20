package borisova.character;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char a = scan.next().charAt(0);
        Character b=new Character(a);
        if (b.isLetter(a)) {
            System.out.println("This is a letter");
        }
        else if (b.isDigit(b)) {
            System.out.println("This is a number");
        }
        else{
            System.out.println("This is whitespace");
        }
    }
}
