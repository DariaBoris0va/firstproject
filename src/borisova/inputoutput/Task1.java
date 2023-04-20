package borisova.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String abc=scan.next();
        try(FileOutputStream fos= new FileOutputStream("text.txt")){
            fos.write(abc.getBytes());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(scan);
    }

}
