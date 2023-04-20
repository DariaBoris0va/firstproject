package borisova.loops;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        String s="*";
        Scanner scan= new Scanner(System.in);
        int input=scan.nextInt();
        for (int j=0; j<input; j++){
            for (int k=0; k < (4 - j / 2); k++)
            {
                System.out.print(" ");
            }
            for (int i=0;i<j+1;i++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}

