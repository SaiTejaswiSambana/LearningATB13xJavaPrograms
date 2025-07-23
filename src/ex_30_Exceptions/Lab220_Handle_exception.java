package ex_30_Exceptions;

public class Lab220_Handle_exception {
    public static void main(String[] args) {
        int a=0;
        try {
            a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //Custo message
            System.out.println("Divide by Zero not allowed");
           // throw new RuntimeException(e);
        }
        //java.lang.ArithmeticException
         System.out.println(a);
    }
}
