package borisova.arrays;

public class TwoDimentionalArray3 {
    public static void main(String[] args) {
        int[][] array=new int[3][3];
        int a=1;
        for (int i=0;i<array.length;i++){
            for (int j=0;j < array[i].length;j++){
                array[i][j]=a++;
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
