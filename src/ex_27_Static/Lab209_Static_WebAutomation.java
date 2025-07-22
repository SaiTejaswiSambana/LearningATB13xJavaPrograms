package ex_27_Static;

public class Lab209_Static_WebAutomation {
    public static void main(String[] args) {
        Automation AU= new Automation();
        System.out.println(Automation.driver);

        Automation AU2= new Automation();
        System.out.println(AU2.driver);

        Automation AU3= new Automation();
        System.out.println(AU3.driver);

    }
}
class Automation{
    static String driver="Chrome";
}
