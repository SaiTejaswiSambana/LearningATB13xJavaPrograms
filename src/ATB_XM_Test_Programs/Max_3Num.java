package ATB_XM_Test_Programs;

import java.util.Scanner;

public class Max_3Num {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a 'a' value: ");
        int a= scanner.nextInt();
        System.out.println("Enter a 'b' value: ");
        int b= scanner.nextInt();
        System.out.println("Enter a 'c' value: ");
        int c= scanner.nextInt();

        if(a>b && a>c){
            System.out.println("Largest number out of 3 is "+ a);
        } else if (b>c) {
            System.out.println("Largest number out of 3 is "+ b);
        }else {
            System.out.println("Largest number out of 3 is" + c);
        }
    }
}
