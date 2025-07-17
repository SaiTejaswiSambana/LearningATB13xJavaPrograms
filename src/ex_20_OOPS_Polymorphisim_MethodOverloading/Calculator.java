package ex_20_OOPS_Polymorphisim_MethodOverloading;

public class Calculator {
    public static void main(String[] args) {
        Clac cl=new Clac();
        cl.add(10,5);
        cl.add(3.12,3.44);
    }
}
class Clac{
    public int add(int a,int b){
        System.out.println("sum of int 2 numbers is "+ (a+b));
        return a+b;
    }
    public double add(double a,double b){
        System.out.println("sum of double 2 numbers is "+ (a+b));//sum of double 2 numbers is 6.5600000000000005-where do we get this 5
        return a+b;
    }
}
