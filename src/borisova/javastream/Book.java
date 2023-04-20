package borisova.javastream;

import java.util.Comparator;
import java.util.List;

public class Book {
        String name;
        int age;

    public Book(String name, int ageCount) {
        this.name = name;
        this.age = ageCount;
    }

    public static Comparator<? super Book> getAge() {
        return getAge();
    }
    static List<Book> getBook() {
        return getBook();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
