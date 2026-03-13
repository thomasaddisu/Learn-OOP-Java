package packages.properties.abstractDemo;

public abstract class Parent {

//    you can also declare a variable inside the abstract class and implement or use this inside the child class
    int age;
    public Parent(int age){
        this.age = age;
    }

    static void hello(){
        System.out.println("Hey this is static method inside abstract class its aloud");
    }

    public void normal(){
        System.out.println("hey this is the normal method inside the abstract class");
    }

    abstract void carrer(String name);
    abstract void partner(String name, String bach);
}
