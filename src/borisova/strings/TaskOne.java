package borisova.strings;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("Enter first word");
        Scanner scanner= new Scanner(System.in);
        String str1= scanner.next();
        System.out.println("Enter second word");
        String str2=scanner.next();

        double a= str1.length();
        double b=str2.length();

        if (a>b){
            System.out.println("First word is longer then second word " + str1 + " " + a);
        }
        else {
            System.out.println("Second word is longer then first word " + str2 + " " + b);
        }
    }
}
