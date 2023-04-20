package borisova.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class T6 {
    public static void main(String[] args) {
        List list= new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        int minValue=(int) Collections.min(list);
        int sum=0;
        for (int i=0; i<list.size(); i++){
            sum+=i;
        }
    }
    public static <T> void minMax(T[] array){

    }
}
