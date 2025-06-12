package ex_01_Java_Basic;

public class Lab016_LabExample_Localvariable {
    public static void main(String[] args) {
        int a=20;
        {
            int b=40;
            System.out.println(b);
        }
        int b=100;
        System.out.println(a+b);
    }
}
