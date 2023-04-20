package borisova.figures;

public class Circle extends Figure{
        double radius=7;
        double pi=3.14;


        @Override
        double calculatePerimeter() {
                return pi*radius*2;
        }

        @Override
        double calculateArea() {
                return radius*radius*pi;
        }
        void printPerimeter(){
                System.out.println(calculatePerimeter());
        }
        void printArea(){
                System.out.println(calculateArea());
        }
}
