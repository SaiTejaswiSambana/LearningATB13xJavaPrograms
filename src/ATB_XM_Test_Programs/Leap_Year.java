package ATB_XM_Test_Programs;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a year :");
        int input_year= scanner.nextInt();
        if ((input_year%4==0 || input_year%400==0)&& input_year!=0){
            System.out.println(input_year + " Its a leap year.");
        }else {
            System.out.println(input_year+ " Its not a leap year .");
        }
    }
}
