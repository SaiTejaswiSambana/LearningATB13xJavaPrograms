package ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {
        P p1= new P();
        System.out.println(P.a);
        System.out.println(p1.a);
        p1.a= 102;
        System.out.println(P.a);
        System.out.println(p1.a);
        //System.out.println(P.b);cannot access directly by class name as it is not a static variable.
        //Object needs to be created to access a variable(non static variable)
        System.out.println("Printing non static variable " +p1.b);

        //The usage of static block is if you want to call some of the methods like data base connection,calling a webdriver collection.

    }
}
class P {
    static int a = 10;
    int b = 30;

    static {
        //This is a static block
        //This is called whenever a class loaded
        System.out.println("Hi,This is called,Bcoz class is loaded");
    }
}

/* Below static block can be created outside the class but it supported only for version -21+
static {
    //This is a static block
    //This is called whenever a class loaded
    System.out.println("Hi,This is called,Bcoz class is loaded");
}*/