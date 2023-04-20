package borisova.override2;

public class Dog extends Pet{
    String child;
    public static void main(String[] args) {
        Dog d=new Dog();
        d.child="Puppy";
    }
    public void setChild(String child){
        this.child=child;
    }
    public String getChild(){
        return this.child;
    }
}
