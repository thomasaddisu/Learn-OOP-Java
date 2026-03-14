package packages.properties.interfaces;

public class NiceCar {
    private Engine engine;
    private Media mediaplayer;

    NiceCar(){
        this.engine = new PowerEngine();
        this.mediaplayer = new CDPlayer();
    }

    void start(){
        engine.start();
    }

    void stop(){
        engine.stop();
    }

    void acc(){
        engine.acc();
    }

    void startMusic(){
        mediaplayer.start();
    }

    void stopMusic(){
        mediaplayer.stop();
    }



}
