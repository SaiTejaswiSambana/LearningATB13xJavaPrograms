package ex_25_OOPS_Abstraction_Interface;

public class Lab198_Interface {
    public static void main(String[] args) {
        Square S1= new Square();
        S1.getArea(10,20);

        Rectangle RC= new Rectangle();
        RC.getArea(20,30);
    }
}
//In Interface to inherit properties from parent class to child "Implement" keyword used.
class Square implements Polygon{

    @Override
    public void getArea(int Length, int Breadth) {
        System.out.println("Area of Square is " + (3.14*Length*Breadth));
    }
}

class Rectangle implements Polygon{

    @Override
    public void getArea(int Length, int Breadth) {
        System.out.println("Area of Rectangle is " + (Length*Breadth));
    }
}
interface Polygon{
    void getArea(int Length,int Breadth);//Incomplete medthod
   /* Void complete(){-complete medthod cannot be created in interface

    }*/
    //in Interface concrete class can be created by using default and static keywords
    default void complete(){
        System.out.println("This is possible");
    }
    default void complete2(){
        System.out.println("This is possible2");
    }
    static void staticComplete(){
        System.out.println("Static F1 in interface allowed, complete");
    }
}

abstract class A {
    abstract void m1();

    void complete() {
        System.out.println("complete!");
    }
}