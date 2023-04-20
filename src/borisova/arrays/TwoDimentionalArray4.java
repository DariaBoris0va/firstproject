package borisova.arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TwoDimentionalArray4 {
    public static void main(String[] args) {
        int[][] array=new int[1][5];
        for (int i=0;i<array.length;i++){
            for (int j=0;j< array.length;j++){
                Scanner scan= new Scanner(System.in);
                array[i][j]=scan.nextInt();
                int max= array[i][j];
                for (i = 1; i < array.length; i++)
                    if (array[i][j] > max)
                        max = array[i][j];
                    else{

                    }
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){

            }
        }
    }
}
