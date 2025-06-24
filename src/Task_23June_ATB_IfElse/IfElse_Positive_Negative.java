package Task_23June_ATB_IfElse;
import java.util.Scanner;
public class IfElse_Positive_Negative {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int input= scanner.nextInt();
        if(input<0){
            System.out.println("Given number is Negative " + input);
        }else{
            System.out.println("Given number is postive");
        }
    }
}
