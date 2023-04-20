package borisova.inputoutput;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("text.txt")) {
            Scanner scan= new Scanner(fr);
            int i = 1;
            while (scan.hasNextLine()) {
                System.out.println(i + " : " + scan.nextLine());
                i++;
            }
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
