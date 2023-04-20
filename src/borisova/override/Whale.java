package borisova.override;

public class Whale extends Cat{
    String name;

    public static void main(String[] args) {
        Whale w=new Whale();
        w.name="Whale";
    }
    public void setName(String name){

        this.name= name;
    }
    public String getName(){
        return "";
    }

}
