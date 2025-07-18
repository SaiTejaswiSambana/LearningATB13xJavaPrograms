package ex_24_OOPS_Abstract;

public class Lab195_Abstarct {
    public static void main(String[] args) {
        car c1= new car();
       // Father f1= new Father(); This is abstract in nature
        child CH= new child();
        CH.loan50k();
        Father F2=new child();//Dynamic Dispatch
        F2.loan50k();
    }
}
class car{
    //This is concrete class
    //A class name with Abstract is called concrete or complete class
    //This doesnt have abstract methods.
    //Without create any method also we can create object of the class(Car)
    void done(){
        System.out.println("Complete class");
    }
}
abstract class Father{
    //Incomplete class
    //abstract function
    abstract void loan50k();//incomplete method

    void loan25k(){//complete function
        System.out.println("Give the 25k");
    }
}
class child extends Father{
     //Class 'child' must either be declared abstract or implement abstract method 'loan50k()' in 'Father

    @Override
    void loan50k() {
        System.out.println("Son has to give the 50K loan");
    }
}