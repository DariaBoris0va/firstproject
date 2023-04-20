package borisova.overload;

public class Task3 {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(2, 3, (Object) 8);
        printMatrix(2, 3, 8);
        printMatrix(2, 3, (byte)8);
        printMatrix(2, 3, (long)8);
        printMatrix(2, 3, (short)8);
        printMatrix(2, 3, (Number)8);
        printMatrix(2, 3, (int) 8);
        printMatrix(2, 3, (Integer) 8);
        printMatrix(2, 3, (char) 8);
    }

    public static void printMatrix(int a, int b, String c) {
        System.out.println("Last is a string");
    }
    public static void printMatrix(int a, int b, Object c) {
        System.out.println("Last is an object");
    }
    public static void printMatrix(int a, int b, int c) {
        System.out.println("Last is an integer");
    }
    public static void printMatrix(int a, int b, byte c) {
        System.out.println("Last is a byte");
    }
    public static void printMatrix(int a, int b, long c) {
        System.out.println("Last is a long");
    }
    public static void printMatrix(int a, int b, short c) {
        System.out.println("Last is a short");
    }
    public static void printMatrix(int a, int b, char c) {
        System.out.println("Last is a char");
    }
}
