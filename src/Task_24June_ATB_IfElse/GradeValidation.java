package Task_24June_ATB_IfElse;
import java.util.Scanner;
public class GradeValidation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter marks from 0 to 100 :");
        int marks=scanner.nextInt();
        while (marks<=100){
            if (marks>=90&& marks<=100){
                System.out.println("Grade A+");
                break;
            } else if (marks>=80 && marks<=89) {
                System.out.println("Grade A");
                break;
            }else if(marks>=70 && marks<=79){
                System.out.println("Grade B");
                break;
            } else if (marks>=60 && marks<=69) {
                System.out.println("Grade C");
                break;
            } else if (marks>=50 && marks<=59) {
                System.out.println("Grade D");
                break;
            } else if (marks>=40 && marks<=49) {
                System.out.println("Grade E");
                break;
            }else {
                System.out.println("Fail!");
                break;
            }

        }
        scanner.close();
    }
}
