package ex_27_Static;

public class Lab207_Static {
    public static void main(String[] args) {
        B B1= new B();
        B1.display();
        B.commonToAll();

    }
}
class B{
    static{
        System.out.println("SIB will call once,when a class is loaded");
    }
    int a=10;//Instance variable
    static int b=20;//Static variable

    void display(){
        System.out.println(b);
        System.out.println("Non static function");
    }
    static void commonToAll(){
       // System.out.println(a); cannot call intance variable in a static method.
        System.out.println("Static function");
    }
    static class C{
        // // Whatever you are going to use in the automation also. Good news.
    }
}