package ex_20_OOPS_Polymorphisim_MethodOverloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperation m1 = new MathOperation();
        m1.add(10,5);
        m1.add(2,3,4);
        m1.add(3.12,4.12);
        m1.add("sai","Teja");
    }
}
    class MathOperation{
        //In the same class,when you have method with same name
        //same name methods but with different aruguments and return types.
        int add(int a,int b){
            System.out.println(a+b);
            return a+b;

        }
        int add(int a,int b,int c) {
            System.out.println(a+b+c);
            return a + b+c;
        }
        double add(double a,double b){
            System.out.println(a+b);
            return a+b;
        }
        String add(String a,String b) {
            System.out.println(a+b);
            return a + b;
        }
    }

