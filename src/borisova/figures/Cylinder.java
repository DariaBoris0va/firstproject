package borisova.figures;

public class Cylinder extends ThreeDFigure{
    double h=6;
    double w=4;
    double r=2;
    double pi=3.14;

    @Override
    double calculatePerimeter() {
        return r*2*h*w;
    }

    @Override
    double calculateArea() {
        return r*2*h*2*w*2;
    }

    @Override
    double calculateVolume() {
        return r*r*h*pi;
    }
    void printPerimeter(){
        System.out.println(calculatePerimeter());
    }
    void printArea(){
        System.out.println(calculateArea());
    }
    void printVolume(){
        System.out.println(calculateVolume());
    }
}
