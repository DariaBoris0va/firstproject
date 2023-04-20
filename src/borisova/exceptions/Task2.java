package borisova.exceptions;

public class Task2 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod() {
        int[] array;
        try {
            array = new int[5];
            array[6]=23;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
