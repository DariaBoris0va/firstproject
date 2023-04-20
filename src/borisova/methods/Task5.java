package borisova.methods;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("What is the number?");
        Scanner scanner1=new Scanner(System.in);
        int a= scanner1.nextInt();
        System.out.println("What is the power?");
        int b=scanner1.nextInt();
        System.out.println(power(a,b));
    }
    static int power(int a, int b){
        int c=1;
        for (int i = 0; i < b; i++) {
            c*=a;
        }
        return c;
    }
}
