package borisova.extensions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\test.text"));
            System.out.println(366 / 0);
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println("file is not found");
        } catch (ArithmeticException e) {
            System.out.println("error, dividing by 0");
        } catch (IOException e) {
            System.out.println("input output error");
        } finally {
            System.out.println("and i will always do it");
        }

    }
}

