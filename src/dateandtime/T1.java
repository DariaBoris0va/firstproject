package dateandtime;

import java.time.YearMonth;



public class T1 {
    public static void main(String[] args) {
        int year=2023;
        for (int i = 1; i <= 12; i++) {
            YearMonth ym= YearMonth.of(year, i);
            int lengths=ym.lengthOfMonth();
            System.out.println("Number of the months is: " + i + " lengths of the months is " + lengths);
        }


    }
}
