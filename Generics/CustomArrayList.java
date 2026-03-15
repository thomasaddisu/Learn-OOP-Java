package Generics;

import java.util.ArrayList;

public class CustomArrayList {
    static void main() {
        ArrayList list = new ArrayList();
        list.add("Thomas");
        list.add("Software Enginnering");
        list.add(3);
        list.add("AASTU");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2,3);
        System.out.println(list);

        list.addAll(list);
        System.out.println(list);

    }
}
