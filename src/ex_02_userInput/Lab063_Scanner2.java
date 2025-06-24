package ex_02_userInput;

import java.util.Scanner;

public class Lab063_Scanner2 {
    public static void main(String[] args) {
        System.out.println("Enter the String ");
        Scanner scanner= new Scanner(System.in);
        String s= scanner.next();
        System.out.println(s);

        System.out.println("Enter the Int ");
        int int_Input = scanner.nextInt();
        System.out.println(int_Input);

        System.out.println("Enter the Double ");
        double double_input= scanner.nextDouble();
        System.out.println(double_input);
    }
}
