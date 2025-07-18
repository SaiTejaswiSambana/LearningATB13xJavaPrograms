package ex_23_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
    car c1= new car();//call's vehicle default constructor
        //car c1= new car(100) //call's vehicle default constructor
    c1.display();
    }
}
class Vehicle{
    int maxSpeed=180;
//method without return type and with the same name as class is called Constructor
    Vehicle(){
        System.out.println("Default Constructor");
    }
    Vehicle(int a){
        System.out.println("Parameterized constuctor "+ a);
    }
    //Method Overloading

    void message(){
        System.out.println("Type 1");
    }
    int message(String a){
        System.out.println("Type 4");
        return 0;

    }

    void display(){
        System.out.println("Vehicle-Parent");
    }
}

class car extends Vehicle{
    private int maxspeed= 280;

    public int getMaxspeed(){
        return maxspeed;
    }
    public void setMaxspeed(int maxspeed){
        this.maxspeed=maxspeed;
    }
    car(){
        super();//calling parents(Vehicle class in this scenario)default constructor
    }
    car(int a){
        super(10);//// parent's parameterized constructor call
    }
    @Override
    void display(){
        System.out.println(super.maxSpeed); //  instance variable call
        System.out.println(this.maxSpeed); // This means my variable call.
        System.out.println("Hi Override!");
    }
}