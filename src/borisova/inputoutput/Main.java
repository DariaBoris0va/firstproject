package borisova.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person person= new Person();
        person.setName("Allen");
        person.setLastname("Berke");
        person.setAge(24);
        person.setHeight(6);
        try (FileOutputStream fos = new FileOutputStream("text.txt")){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
