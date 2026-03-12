package packages.properties.abstractDemo;

public  class Son extends Parent{
    @Override
    void carrer(String name) {
        System.out.println("I am going to be a "+ name);
    }

    @Override
    void partner(String name, String bach) {
        System.out.println("I love "+ name + "She is:"+bach);
    }
}
