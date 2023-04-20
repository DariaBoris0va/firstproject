package dateandtime;

import java.time.LocalDate;
import java.util.Date;

public class T3 {
    public static void main(String[] args) {
        LocalDate bday=LocalDate.of(2006,02,10);
        LocalDate today = LocalDate.now();
        if (today.isAfter(bday)){
            System.out.println("You are 17");
        }
        else{
            System.out.println("You are not born yet");
        }
    }
}
