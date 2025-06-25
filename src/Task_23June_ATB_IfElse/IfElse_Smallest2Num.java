package Task_23June_ATB_IfElse;
import java.util.Scanner;
public class IfElse_Smallest2Num {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1= scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2= scanner.nextInt();
        if(num1==num2){
            System.out.println("Both name are equal");
        }else{
            System.out.println(Math.min(num1,num2));
        }
    }
}
