package borisova.reflection;


import com.sun.corba.se.spi.ior.Identifiable;
import org.omg.CORBA_2_3.portable.OutputStream;

public class Person implements Identifiable {
    private String name;
    private Integer age;
    private Integer number;

    public static String getField() {
        return getName();
    }

    public Integer getAge(){
        return age;
    }
    private void print(String name){
        System.out.println();
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void write(OutputStream arg0) {

    }

    public interface Identifiable{
        String getUniqueData();
    }
    private static String getName() {
        return Person.getName();
    }

}
