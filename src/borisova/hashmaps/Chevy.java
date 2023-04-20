package borisova.hashmaps;

public class Chevy extends Car{
    public Chevy(String carBrand, String model, int year, String color) {
        super(carBrand, model, year, color);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
