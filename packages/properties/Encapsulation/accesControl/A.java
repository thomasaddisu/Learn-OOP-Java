package packages.properties.Encapsulation.accesControl;

public class A {
    int num;
    String name;
    int[]  arr;

    A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];

    }
}
