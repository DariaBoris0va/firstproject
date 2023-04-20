package borisova.methods;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println(multiply(a));
    }
    static int multiply(int a){
        return a*a+4;
    }
}
