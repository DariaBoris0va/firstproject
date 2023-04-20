package borisova.inputoutput;

import java.io.IOException;

public class Tst {
    public static void main(String[] args) {
        try(SomeResource r=new SomeResource()) {
            throw new RuntimeException("RuntimeException");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
class SomeResource implements java.io.Closeable{
    public void close() throws IOException{
        throw new IOException("Close exception");
    }
}
