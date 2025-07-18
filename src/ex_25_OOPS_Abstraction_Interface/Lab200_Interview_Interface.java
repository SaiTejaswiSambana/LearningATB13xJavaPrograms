package ex_25_OOPS_Abstraction_Interface;

public class Lab200_Interview_Interface {
    public static void main(String[] args) {

    }
}

interface I11{}
interface I12{}
class A1{}
class B1{}
abstract class Pramod{
    abstract void pp();
}
class Test1 extends A1{}
//class Test2 extends A1,B1{} // // Multiple Interheirn in class is not allowed
class Test3 implements I11{}//Possible scenario
class Test4 implements I12,I11{}//Possible scenario
class Test5 extends A1 implements I11,I12{}//Possible scenario
//class Test6 implements I11 extends A1{}//Not possible
//interface I3 extends A1{}..interface cannot be inherited by extend keyword
interface I3{}//Possible scenario
interface I4{//Possible scenario

    //Multiple default methods possible in interface
    default void m1(){

    }
    default void m4(){

    }
    default void m19(){

    }
    static void m2(){

    }

//    void comcreate(){
//
//    }
}
