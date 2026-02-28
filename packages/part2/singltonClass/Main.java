package packages.part2.singltonClass;

public class Main {
    static void main() {

        SingltonClass obj1 = SingltonClass.getInstance();
        SingltonClass obj2 = SingltonClass.getInstance();
        SingltonClass obj3 = SingltonClass.getInstance();
        System.out.println(obj1);
        System.out.println(obj1);
        System.out.println(obj1);

    }
}
