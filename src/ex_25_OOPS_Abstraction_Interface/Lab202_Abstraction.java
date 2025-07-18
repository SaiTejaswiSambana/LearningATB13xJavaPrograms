package ex_25_OOPS_Abstraction_Interface;

public class Lab202_Abstraction {
}
abstract class Incomplete_abstract{
    int a= 10;

    Incomplete_abstract(){
        //Abstract class can have constructor
    }


    abstract void display1();
    void display2(){
        a= 25;
        System.out.println("print");
    }
}

interface Incomplete_Interface{
//    Incomplete_Interface(){
//        Interface never have a constructor concept.
//    }

    int a = 10; // final
    //a value cannot be changed as int a is final in Interface
    void display();

    default void display2(){
        //a = 12;
        System.out.println("Default is allowed!");
    }

    static void display3(){
        System.out.println("Default is allowed!");
    }
}
