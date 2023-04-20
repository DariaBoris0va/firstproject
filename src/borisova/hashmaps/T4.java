package borisova.hashmaps;

import java.util.HashMap;

public class T4 {
    public static void main(String[] args) {
        HashMap <Integer, String> cars= new HashMap<>();
        cars.put(2019, "Mazda");
        cars.put(2020, "Cadillac");
        cars.put(2019, "BMW");
        cars.put(2018, "Chevrolet");
        cars.put(2020, "Mercedece");
        cars.put(2012, "Nissan");
        int a=0;
        int b=0;
        cars.entrySet().contains(2019);
            if (cars.containsKey(2019)) {
                a++;
            }
            else if (cars.containsKey(2020)) {
                b++;
            }
        System.out.println("Amount of 2019 cars:" + a);
        System.out.println("Amount of 2020 cars:" + b);
    }

}
