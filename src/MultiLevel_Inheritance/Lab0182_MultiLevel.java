package MultiLevel_Inheritance;

public class Lab0182_MultiLevel {
    public static void main(String[] args) {

        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

        System.out.println("--------");
        Father fa= new Father();
        fa.home();
        fa.f();

        System.out.println("--------");
        Son s= new Son();
        s.home();
        s.s();
    }
}
