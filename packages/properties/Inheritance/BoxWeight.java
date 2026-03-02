package packages.properties.Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight others){
        super(others);
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l,w,h);
        this.weight = weight;
    }
}
