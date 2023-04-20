package borisova.override;

public class Cat {
    String name;

    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="Cat";
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return this.name;
    }

}

