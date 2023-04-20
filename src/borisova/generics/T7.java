package borisova.generics;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("3");
        list.add("6");
        list.add("9");
        Scanner scan=new Scanner(System.in);
        String a= scan.next();
        int num=Integer.valueOf(a);
        if (num == 1){
            System.out.println(list.get(0));
        }
        if (num == 2){
            System.out.println(list.get(1));
        }
        if (num == 3){
            System.out.println(list.get(2));
        }
    }
}
