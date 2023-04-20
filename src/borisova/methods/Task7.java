package borisova.methods;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("What is the number");
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();
        System.out.println("What is the second number");
        int num2= scanner.nextInt();
        System.out.println("What is the operation?");
        int operation= scanner.nextInt();
        System.out.println(calculate(num,num2,operation));
    }
    static int calculate(int num, int num2, int operation){
        if(operation==1){
            return num+num2;
        }
        else if(operation==2){
            return num-num2;
        }
        else if(operation==3){
            return num*num2;
        }
        else if(operation==4){
            return num/num2;
        }
       else{
           return 0;
        }
    }
}
