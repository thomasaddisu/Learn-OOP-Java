package packages.properties.Polymorphism;

public class Main {
    static void main() {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();


        shapes.area();
        circle.area();
        square.area();

//        Numbers obj = new Numbers();
//        obj.sum(1,2);
//        obj.sum(2,3,4);
    }
}
