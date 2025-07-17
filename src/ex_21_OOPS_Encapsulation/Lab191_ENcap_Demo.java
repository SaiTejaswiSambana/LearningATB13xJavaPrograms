package ex_21_OOPS_Encapsulation;

public class Lab191_ENcap_Demo {
    public static void main(String[] args) {
    VWOLogin VL= new VWOLogin("123","Teja");
        System.out.println(VL.Pswd);

        GoodVWOLogin GL= new GoodVWOLogin("Teja","PWD123");
       // System.out.println(GL.Password);cannot access Password as it is prite
        System.out.println(GL.getPassword());
        GL.setPassword("Teja123",true);
        System.out.println(GL.getPassword());

    }
}
//Not a encapsulated class.As,We can see or print the password in the mainclass
class VWOLogin{
    public String username;
    public String Pswd;
//Parametrerized constructor
    public VWOLogin(String Pswd,String username){
        this.Pswd= Pswd;
        this.username= username;
    }
}
class GoodVWOLogin{
    //Intsance variable/Attributes,Properties,Field,Data Variable
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin){
           this. Password = password;
        }else{
            System.out.println("You cant set password");
        }

    }

    //Parametrerized constructor
    public GoodVWOLogin(String usr,String pwd){
        this.Username=usr;
        this.Password=pwd;

    }


}