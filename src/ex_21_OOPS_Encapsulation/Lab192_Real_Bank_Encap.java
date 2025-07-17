package ex_21_OOPS_Encapsulation;

public class Lab192_Real_Bank_Encap {
    public static void main(String[] args) {
        Bank b=new Bank("Teja",100);
        System.out.println(b.getBal());
        b.setBal(500,false);
        System.out.println(b.getBal());
        //long balance=b.setBal(500,true);-error is coming
    }
}
class Bank{
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.
    private String name;
    private  long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) {
        if(isCashier){
            this.bal = bal;
        }
        else {
            System.out.println("wont set");
        }

    }



    //Parameterized constructor
    public Bank(String name,long bal){
        this.name=name;
        this.bal=bal;

    }
}