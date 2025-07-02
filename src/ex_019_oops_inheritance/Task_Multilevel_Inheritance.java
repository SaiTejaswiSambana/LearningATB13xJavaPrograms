package ex_019_oops_inheritance;

public class Task_Multilevel_Inheritance {
    public static void main(String[] args) {
    superAdmin sa= new superAdmin();
    sa.shutdownSystem();
    sa.acessAdminPanel();
    sa.login();
    }
}
class user{
    void login(){
        System.out.println("Login id");
    }
}
class AdminUser extends user{
    void acessAdminPanel(){
        System.out.println("Admin Panel");
    }
}
class superAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("Shutdown");
    }
}