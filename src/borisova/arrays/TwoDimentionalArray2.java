package borisova.arrays;

public class TwoDimentionalArray2 {
    public static void main(String[] args) {
        char[][] a=new char[5][5];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j || i+j==4){
                    a[i][j]='x';
                }
                else{
                    a[i][j]=' ';
                }

            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
}
