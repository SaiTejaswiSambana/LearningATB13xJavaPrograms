package ex_20_OOPS_Polymorphisim_MethodOverloading;

public class WebAutomation {
    public static void main(String[] args) {
        Browser b1= new Browser();
        b1.startbrowser();
        b1.startbrowser("Chrome");
    }
}
//Why we create the class outside the main class
class Browser{

    void startbrowser(){
        System.out.println("Starting a default browser");
    }
    String startbrowser(String browser){
        System.out.println("Starting browser " +browser);
        return browser;
    }
}