package borisova.arrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
        Scanner scan= new Scanner(System.in);
        int input=scan.nextInt();
        for (int i=0;i<10;i++){
            if (input==array[i]){
                System.out.println("Yes, " + input + " is in the array");
            }
            else{
                System.out.println("No " + input + " is not in the array");
            }
        }
    }
}
