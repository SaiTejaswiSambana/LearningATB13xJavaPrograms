package ex_30_Exceptions;

public class Lab231_JR_QA_SR_QA3 {
    public static void main(String[] args) {
        try {
            String a = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int b = Integer.parseInt(a);// NumberFormatException
            int c = 100 / b;// ArithmeticException
            System.out.println(c);
        }catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
