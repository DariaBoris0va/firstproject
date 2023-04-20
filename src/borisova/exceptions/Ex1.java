package borisova.exceptions;

public class Ex1 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        try {
            int a= Integer.parseInt(null);
        }
        catch (ArithmeticException e){
            System.out.println("Only for calculating");
        }
        catch (Exception e){
            System.out.println("General class");
        }
    }

}

