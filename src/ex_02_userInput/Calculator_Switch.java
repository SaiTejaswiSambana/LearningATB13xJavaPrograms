package ex_02_userInput;

import java.util.Scanner;

public class Calculator_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 ");
        double num1= scanner.nextDouble();

        System.out.println("Enter num2 ");
        double num2= scanner.nextDouble();

        System.out.println("Enter one operator from +,-,*,/ ");
        char ch=scanner.next().charAt(0);

            double result;

        switch(ch){
            case '+':
                result= num1+ num2;
                System.out.println(result);
                break;

            case '-' :
                result = num1-num2;
                System.out.println(result);
                break;

            case '*' :
                result = num1*num2;
                System.out.println(result);
                break;
            case '/' :
                if (num2!=0){
                result = num1/num2;
                System.out.println(result);}
                else{
                    throw new ArithmeticException("Num2 canno be Zero");
                    //System.out.println("Error: num2 should not be zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
