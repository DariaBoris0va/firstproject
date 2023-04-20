package borisova.methods;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println(compare(a));
    }
    static boolean compare(int a){
        if(a>69){
            return true;
        }
        else {
            return false;
        }
    }
}
