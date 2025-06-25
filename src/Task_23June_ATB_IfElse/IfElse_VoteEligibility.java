package Task_23June_ATB_IfElse;
import java.util.Scanner;
public class IfElse_VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age= scanner.nextInt();

        if(age>=18){
            System.out.println("You're eligible for vote. ");
        }else{
            System.out.println("You're Minor");
        }

    }
}
