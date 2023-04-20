package borisova.loops;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
       String s="*";
       Scanner scan= new Scanner(System.in);
       int input=scan.nextInt();
       for (int j=0; j<input; j++){
           for (int i=0;i<5;i++){
               System.out.print(s);
           }
           System.out.println();
       }
    }
}
