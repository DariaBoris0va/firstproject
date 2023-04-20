package borisova.interfacetask;

public class Dog {
    String name;
    int age;
    int height;
    String breed;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return this.height;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return this.breed;
    }

    public Dog(String name, int age, int height, String breed) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }


}
