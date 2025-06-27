package Task_24June_ATB_IfElse;

import java.util.Scanner;

public class LeapYear_Check {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a year: ");
        int input_Year= scanner.nextInt();

        if((input_Year%4==0 || input_Year%400==0)&& input_Year!=0){
            System.out.println(input_Year+ " "+"Its a leap year");

        }else {
            System.out.println(input_Year+ " " + "Its not a leap year");
        }
    }
}
