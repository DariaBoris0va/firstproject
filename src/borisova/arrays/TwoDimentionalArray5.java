package borisova.arrays;

import java.util.Scanner;

public class TwoDimentionalArray5 {
    public static void main(String[] args) {
        int[][] array=new int[5][5];
        Scanner input = new Scanner(System.in);
        for (int i=0;i<array.length;i++){

            for (int j=0;j<array.length;j++){
                array[i][j]=input.nextInt();
                if(array[i][j]>7 && array[i][j]<13){
                    System.out.println(array[i][j] + " (" + i + "," + j + ")");
                }
            }
        }
    }
}
