package ATB_XM_Test_Programs;

public class Comparison_Logical_Operator {
    public static void main(String[] args) {
        int a =10;
        int b= 11;
        System.out.println("a==b " + (a==b));
        System.out.println("a!=b "+ (a!=b));
        System.out.println("a>b "+ (a>b));
        System.out.println("a<b "+ (a<b));
        System.out.println("a>=b "+ (a>=b));
        System.out.println("a<=b "+ (a<=b));
        System.out.println("result is "+ (a>b || a<b));
        System.out.println("Result for && operator "+ (a<b && a>b));
    }
}
