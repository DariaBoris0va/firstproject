package borisova.methods;

public class Task2 {
    public static void main(String[] args) {
        int a=2;
        int b=69;
        int c=228;
        System.out.println(iseven(a));
        System.out.println(iseven(b));
        System.out.println(iseven(c));
    }
    static boolean iseven(int a){
        if (a%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
