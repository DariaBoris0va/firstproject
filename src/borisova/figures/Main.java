package borisova.figures;

public class Main {
    public static void main(String[] args) {
         Quadrangle quadrangle=new Quadrangle();
         quadrangle.printPerimeter();
         quadrangle.printArea();
         Circle circle=new Circle();
         circle.printPerimeter();
         circle.printArea();
         Cylinder cylinder=new Cylinder();
         cylinder.printArea();
         cylinder.printPerimeter();
         cylinder.printVolume();
    }
}
