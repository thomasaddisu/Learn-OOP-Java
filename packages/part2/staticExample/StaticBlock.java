package packages.part2.staticExample;

public class StaticBlock {
    static int a = 5;
    public static int b;
    static{
        System.out.println("these run when the first obj create or the class is loaded");
        b = a * 4;
    }

}


