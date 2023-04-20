package borisova.javastream;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Titanic", 39);
        Book book2 = new Book("Notebook", 23);
        Book book3 = new Book("Hunger Games", 40);
        Stream<Book> age = Stream.of(new Book("Titanic", 39), new Book("Notebook", 23),
                new Book("Hunger Games", 40));
    }}
