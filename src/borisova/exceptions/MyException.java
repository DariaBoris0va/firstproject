package borisova.exceptions;

public class MyException{
    public static void main(String[] args) {
        try{
            System.out.println(6/0);
        }
        catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception");
        }
        catch (Exception ex){
            System.err.println("Exception!!!");
        }
        finally {
            System.out.println("No exception");
        }
    }


}
