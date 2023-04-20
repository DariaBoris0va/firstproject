package borisova.generics;

import java.util.ArrayList;
import java.util.List;

public class T3 {
    public static void main(String[] args) {
        List list= new ArrayList<>();
        list.add(1);
        list.add(2);
    }
    public static <T> void replaceElements(T[] array, int number1, int number2){
        T temp=array[number1];
        if (number1<number2){
            array[number1]=array[number2];
        }
        else {
            array[number2]=temp;
        }
    }
}
