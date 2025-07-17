package ex_20_OOPS_Polymorphisim_MethodOverloading.MethodOverriding;

public class Lab190_Methodoverriding_Automation {
    public static void main(String[] args) {
        commonToALL C1= new commonToALL();
        C1.openBrowser();
        ChromeTc CT= new ChromeTc();
        CT.openBrowser();
        FireFox FF= new FireFox();
        FF.openBrowser();

        //Dynamic Dispatch
        commonToALL CA=new ChromeTc();
        CA.openBrowser();//ChromeTC method will get called
    }
}
 class commonToALL {
     void openBrowser() {
         System.out.println("IE Browser");
     }
 }
    class ChromeTc extends commonToALL{
    @Override
    void openBrowser(){
            System.out.println("Chrome Browser");
        }
    }
    class FireFox extends commonToALL{
    @Override
    void openBrowser(){
        System.out.println("Firefox Browser");
    }
    }


