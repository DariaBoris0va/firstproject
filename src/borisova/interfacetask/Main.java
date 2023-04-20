package borisova.interfacetask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] bookArray={
                new Book("War and Piece vo.1", "Lev, Tolstoy",202),
                new Book("War and Piece vo.2", "Lev, Tolstoy",308),
                new Book("War and Piece vo.3", "Lev, Tolstoy",346),
                new Book("War and Piece vo.4", "Lev, Tolstoy",322),
                new Book("War and Piece epilogue", "Lev, Tolstoy",96),
                new Book("Fahrenheit", "Ray, Bradbury",256)
        };
        Arrays.sort(bookArray);
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].toString());
        }
        Dog[] dogArray={
                new Dog("Sparky", 5,1, "Dachshund" ),
                new Dog("Lucky", 2,2,"Hound"),
                new Dog("Bobik", 3,1,"Bulldog"),
                new Dog("Barbos", 7, 2,"Laika")
        };
        Arrays.sort(dogArray, new DogComparator());
        for (Dog dog: dogArray){
            System.out.println(dog);
        }

    }
}
