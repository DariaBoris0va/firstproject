package borisova.extensions;



public class Ex2 {
    public static void main(String[] args) {
        try{
            int myInt=Integer.parseInt("Socks");
        }
        catch (NumberFormatException e){
            System.out.println("Hey You can't do that!");
        }
        finally {
            System.out.println("The final block!");
        }
    }
}

