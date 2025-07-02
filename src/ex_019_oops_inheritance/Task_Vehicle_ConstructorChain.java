package ex_019_oops_inheritance;

public class Task_Vehicle_ConstructorChain {
    public static void main(String[] args) {
    Bike b=new Bike();

    }
}
class Vehicle{
    Vehicle(){
        System.out.println("Vehicle is ready");
    }
}
class Bike{
    Bike(){
        System.out.println("Bike is ready");
    }
}