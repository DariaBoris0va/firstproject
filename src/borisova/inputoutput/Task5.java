package borisova.inputoutput;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String abc=scan.next();
        byte[] buffer=abc.getBytes();
        try(ByteArrayOutputStream baos=new ByteArrayOutputStream();){
            baos.write(buffer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
