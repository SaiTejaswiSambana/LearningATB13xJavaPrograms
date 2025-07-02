package MultiLevel_Inheritance;

public class Lab183_MultiLevel {
    public static void main(String[] args) {
        Son amit = new Son();
        // Son s1 = new Father();
        // Son s1 = new GrandFather();

        GrandFather g2= new Father();
        g2.home();
        GrandFather g3= new Son();
        g3.gf();

        System.out.println("Father-----------");
        Father f1= new Son();
        f1.home();
        f1.f();

        // WebDriver driver = new ChromeDriver();

        // Father f3 = new GrandFather();


    }
}
