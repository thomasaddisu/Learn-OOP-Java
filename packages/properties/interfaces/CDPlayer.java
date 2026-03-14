package packages.properties.interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("cd player start");
    }

    @Override
    public void stop() {
        System.out.println("cd player stop");
    }
}
