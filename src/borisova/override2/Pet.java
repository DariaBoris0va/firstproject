package borisova.override2;

public class Pet {
    public static void main(String[] args) {
        Cat cat1= new Cat();
        cat1.setChild("Kitten");
        System.out.println("Cat breeds Cat = "+ cat1.getChild());
        Dog dog1= new Dog();
        dog1.setChild("Puppy");
        System.out.println("Dog breeds Dog = "+ dog1.getChild());
    }

}
