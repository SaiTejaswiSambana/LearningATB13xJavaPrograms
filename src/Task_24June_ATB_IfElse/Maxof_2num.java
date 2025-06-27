package Task_24June_ATB_IfElse;

import java.util.Scanner;

public class Maxof_2num {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1= scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2= scanner.nextInt();
        if(num1>num2){
            System.out.println(num1 +" "+ "is Largest");
        }else if(num2>num1){
            System.out.println(num2 +" is Largest");
        }else {
            System.out.println("Both are equal ");
        }
    }
}
