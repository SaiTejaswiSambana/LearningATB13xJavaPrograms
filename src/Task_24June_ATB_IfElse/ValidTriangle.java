package Task_24June_ATB_IfElse;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the a side triangle ");
        int a=scanner.nextInt();
        System.out.println("Enter the b side triangle ");
        int b=scanner.nextInt();
        System.out.println("Enter the c side triangle ");
        int c= scanner.nextInt();
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("its a valid triangle");
        }else {
            System.out.println("It's not a valid triangle");
        }
        scanner.close();
    }
}
