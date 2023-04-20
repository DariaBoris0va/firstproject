package borisova.exceptions;

public class Task5 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        try {
            int a= Integer.parseInt("string");
        }
        catch (NumberFormatException e){
            System.out.println("arithmetic exception");
        }


    }
}
