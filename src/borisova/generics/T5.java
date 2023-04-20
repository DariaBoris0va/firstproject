package borisova.generics;

import java.util.List;

public class T5 {
    public static void print(List<? extends Number> list) {

        for (Number n : list)

            System.out.print(n + " ");

        System.out.println();

    }
}
