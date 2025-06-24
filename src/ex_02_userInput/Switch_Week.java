package ex_02_userInput;

import java.util.Scanner;

public class Switch_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7 ");
        int week= scanner.nextInt();
        switch (week){
            case 1:
                System.out.println("Its a Monday");
                break;
            case 2:
                System.out.println("Its a Tuesday");
                break;
            case 3:
                System.out.println("Its a Wednesday");
                break;
            case 4:
                System.out.println("Its a Thursday");
                break;
            case 5:
                System.out.println("Its a Friday");
                break;
            case 6:
                System.out.println("Its a Saturday");
                break;
            case 7:
                System.out.println("Its a Sunday");
                break;
            default:
                System.out.println("Please enter valid number");
                break;
        }

    }
}
