package borisova.arrays;

import java.util.Scanner;

public class TwoDimentionalArray1 {
    public static void main(String[] args) {
        int[][] array=new int[3][3];
        for (int i=0;i<array.length;i++){
            for (int j=0;j < array[i].length;j++){
                Scanner scan= new Scanner(System.in);
                array[i][j]=scan.nextInt();
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
