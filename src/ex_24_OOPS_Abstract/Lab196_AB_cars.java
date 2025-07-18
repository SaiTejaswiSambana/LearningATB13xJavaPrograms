package ex_24_OOPS_Abstract;

public class Lab196_AB_cars {
    public static void main(String[] args) {
        Wagonor WG=new Wagonor();
        WG.drive();
    }
}
abstract class Engine{
    //Incomplete functions
    abstract void StartEngine();
    abstract void StopEngine();

    void check(){
        System.out.println("Everything is good");
    }
}
class Wagonor extends Engine{

    @Override
    void StartEngine() {
        System.out.println("Start the car");
    }

    @Override
    void StopEngine() {
        System.out.println("Stop the car");
    }

    void drive(){
        StopEngine();
        StopEngine();
        check();
    }
}