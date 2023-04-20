package borisova.methods;

public class Task1 {
    public static void main(String[] args) {
        int a=228;
        int b=69;
        System.out.println(compare(a,b));
    }
    static int compare(int a, int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
