package packages.properties.interfaces;

public class Car implements Engine, Media, Breke {

    @Override
    public void breke() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start normal car engine");
    }




    @Override
    public void stop() {
        System.out.println("I stop a normal car engine");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate a normal car");

    }
}
