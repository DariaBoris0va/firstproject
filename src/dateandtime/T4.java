package dateandtime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class T4 {
    public static void main(String[] args) {
        Calendar bday = new GregorianCalendar(2006, 02, 10);
        Calendar today= new GregorianCalendar(2023,04,10);
        System.out.println(bday.DAY_OF_WEEK + " " + bday.DAY_OF_YEAR + " " + bday.DAY_OF_MONTH);
        long differance=today.getTimeInMillis()-bday.getTimeInMillis();
        long days=differance/(24*60*60*1000);
        System.out.println(days + " Days");
    }
}
