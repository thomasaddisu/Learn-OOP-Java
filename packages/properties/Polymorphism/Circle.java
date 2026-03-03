package packages.properties.Polymorphism;

public class Circle extends Shapes{

//    this runs when the obj of class circle is created
//    hence it is overriding the parent method
     // this is called annotation its used to check if the methods is override or not
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
