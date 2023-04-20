package borisova.classestst;

public class Tst {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person();
        p1.setHeight(180);
        p2.setHeight(190);
        System.out.println(p1.getHeight()+ p2.getHeight() / 2);
    }
}

