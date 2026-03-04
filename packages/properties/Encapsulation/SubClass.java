package packages.properties.Encapsulation;

import packages.properties.Inheritance.Box;

public class SubClass extends Box {

    SubClass(double side){
        super(side);
    }


    static void main() {
//        Box mysub = new Box(9);
//        System.out.println(mysub.l);
        SubClass subs1 = new SubClass(0);
        System.out.println(subs1.l);
    }

//   we can access the protected l because subclass is the subclass of Box but you can sout(mysub.l) ate the other class like Main out side the subClass of the Box class
}
