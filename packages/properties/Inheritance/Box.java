package packages.properties.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    // cube
    Box(double side) {
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
}
