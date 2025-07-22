package ex_26_Instance_Initialization_Block_IIB;

public class Lab203_IIB {
    //IIB
    //Instance initialization block
    //It will be executed when Object is created.

    public static void main(String[] args) {
        A a= new A();
        //A is class
        //a is reference
        //new A() is object

        // If a class has 2 objects created then IIB will be classed Twice
        A a1= new A();
        //Constructor will also be called Twice
        //Static block will call only once.
    }
}

class A{
    //default constructor
    A(){
        System.out.println("DC");
    }
    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something  When object is created");
        //My Sql connection
        //read a CSV,XLSX file
        //read a Json XML
        //read a text file or env file
    }
    //Can we have multiple IIB's -Yes
    {
        System.out.println("Hi, I am IIB 2");
    }
    {
        System.out.println("Hi, I am IIB 3");
    }
    static{
        System.out.println("Static block will be called only once when a class is loaded");
    }
}
