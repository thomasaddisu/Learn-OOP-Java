package packages.properties.Inheritance;

public class Box {
    protected double l;
    double h;
    double w;


    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    // cube
    public Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l, double w, double h){
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }




    public void information(){
        System.out.println("The Box is Running");
    }

//    static void main() {
//        SubClass1 mysub = new SubClass1(7);
//        System.out.println(mysub.l);
//    }
// you cant acces the private var l eventhoght its in the same Class

}

 class  SubClass1 extends Box{
    SubClass1(double side){
        super(side);
    }
//     static void main() {
//         SubClass1 mysub = new SubClass1(7);
//         System.out.println(mysub.l);
//     }

//     you cant acces the private var "l" dirrectly eventhoug it's in the same package


}
