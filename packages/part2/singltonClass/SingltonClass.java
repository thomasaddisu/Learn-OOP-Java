package packages.part2.singltonClass;

public class SingltonClass {
    private SingltonClass(){

    }
    private static SingltonClass instance;

    public static SingltonClass getInstance(){
        if (instance==null){
            instance = new SingltonClass();
        }

        return instance;
    }
}
