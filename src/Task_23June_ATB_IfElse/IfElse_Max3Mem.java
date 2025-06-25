package Task_23June_ATB_IfElse;

import java.util.Scanner;

public class IfElse_Max3Mem {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1= scanner.nextInt();
        System.out.println("Enter num2 ");
        int num2= scanner.nextInt();
        System.out.println("Enter num3 ");
        int num3= scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1 + " "+ "is Largest");
        } else if (num2>num3) {
            System.out.println(num2 + " "+ "is Largest");

        }else{
            System.out.println(num3 + " "+ "is Largest");
        }

    }
}
