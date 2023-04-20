package dateandtime;

import java.util.Date;

public class T2 {
    public static void main(String[] args) {
        Date date1=new Date(2023-01-13);
        Date date2=new Date();
        if (date1==date2){
            System.out.println("These two match");
        }
        else {
            System.out.println("They do not match");
        }
    }
}
