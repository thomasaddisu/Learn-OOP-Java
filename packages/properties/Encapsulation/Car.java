package packages.properties.Encapsulation;

// lets see data hiding and ecnapsulation together
// data hiding means prevent outside access for the class
// wrapping inplementatio  of data member and method of a class in a class
public class Car {
     public String name;
    private String color;
    int[]  password ;

    public void setColor(String color){
        this.color = color;
    }

    public void getColor(){
        System.out.println(this.name + "Model 2025 Color is:" + this.color);
    }


}
