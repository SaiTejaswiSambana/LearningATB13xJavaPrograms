package ex_02_userInput;

import java.util.Scanner;

public class Lab062_Scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age= scanner.nextInt();
        String CanIVote=age>18? "Yes": "No";
        System.out.println(CanIVote);
    }
}
