package borisova.inputoutput;

import java.io.*;

import static java.lang.System.out;

public class Task6 {
    public static void main(String[] args) {
        String str= "Hello";
        try(FileOutputStream fos= new FileOutputStream("text.txt")){
            fos.write(str.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
