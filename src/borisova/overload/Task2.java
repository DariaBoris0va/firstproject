package borisova.overload;

public class Task2 {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }
    public static void print(double a){
        System.out.println("This is a double");
    }

    public static void print(int b) {
        System.out.println("This is an integer");
    }

    public static void print(Object c){
        System.out.println("This is an object");
    }
}
