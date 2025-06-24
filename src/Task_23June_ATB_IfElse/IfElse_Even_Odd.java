package Task_23June_ATB_IfElse;
import java.util.Scanner;
public class IfElse_Even_Odd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scanner.nextInt();
        if (num%2==0){
            System.out.println(num +" " + "Its an even number. ");
        }else{
            System.out.println(num +" " + "Its an odd number. ");
        }
    }
}
