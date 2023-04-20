package borisova.override2;

public class Cat extends Pet{
    String child;
    public static void main(String[] args) {
    Cat c=new Cat();
    c.child="Kitten";
    }
    public void setChild(String child){
        this.child=child;
    }
    public String getChild(){
        return this.child;
    }
}
