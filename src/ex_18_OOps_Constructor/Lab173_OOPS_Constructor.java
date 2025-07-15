package ex_18_OOps_Constructor;

public class Lab173_OOPS_Constructor {
    public static void main(String[] args) {
    baby b= new baby();
    b.cry();
    }
}
class baby {
    // Attribute | Instance Variable |  Member variables, data members
    String name;

    // Default Constructor!
    baby() {
        System.out.println("I am called, Default Constructor!");
        System.out.println("Your Aadhar Number is ready!");

        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)

    }

    void m1() {
        System.out.println("I m1");
    }
    // Behaviour
    void cry(){
        System.out.println("Cry!!");
    }

    void sleep(){
        System.out.println("Sleep!!");
    }

    void eat(){
        System.out.println("Eat!!");
    }


}
