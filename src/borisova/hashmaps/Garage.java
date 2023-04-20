package borisova.hashmaps;

import java.util.HashMap;

public class Garage {
    public static void main(String[] args) {
        HashMap<Integer, Car> allCars= new HashMap<>();
        Car car1= new Car("BMW", "M340i", 2019, "Black");
        Car car2= new Car("Mercedes", "G-Wagon", 2020, "White");
        Car car3= new Car("Chevy", "Camaro zl1", 2022, "Red");
        Car car4=new Car("Audi", "A7", 2021, "Grey");
        allCars.put(1,car1);
        allCars.put(2, car2);
        allCars.put(3, car3);
        allCars.put(4, car4);
    }
    public void park(){

    }
    public void leavingParking(){

    }
    public void numberOfCarsLeaving(){

    }
}
