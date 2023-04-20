package borisova.figures;

public class Quadrangle extends Figure {
         double l = 10;
         double w = 15;

    @Override
    double calculatePerimeter() {
        return l+l+w+w;
    }

    @Override
    double calculateArea() {
        return l*w;
    }
    void printPerimeter(){
        System.out.println(calculatePerimeter());
    }
    void printArea(){
        System.out.println(calculateArea());
    }
}