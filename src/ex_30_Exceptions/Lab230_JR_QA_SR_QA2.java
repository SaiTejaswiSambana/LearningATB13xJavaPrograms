package ex_30_Exceptions;

public class Lab230_JR_QA_SR_QA2 {
    public static void main(String[] args) {
       try {
           String a = args[0];
           int b = Integer.parseInt(a);
           int c = 100 / b;
           System.out.println(c);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
