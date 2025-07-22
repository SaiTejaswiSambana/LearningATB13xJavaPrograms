package ex_27_Static;

public class Lab208_Real_Static {
    public static void main(String[] args) {
        ATB atb= new ATB();
    }
}
class ATB{
    static {//Static block
        System.out.println("Load the class?, I will execute");
    }
    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Instance variables 0r non static
    private String name;
    private String  phone;

    //Static variables-which can be shared with Objects

    static String CourseName="ATB13x";
    static String Mentor= "Pramod";
    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }

    void howTheyAssignment(){
        System.out.println("It is different!");
    }

}
