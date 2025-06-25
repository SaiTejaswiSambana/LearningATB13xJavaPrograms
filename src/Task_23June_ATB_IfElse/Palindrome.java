package Task_23June_ATB_IfElse;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter a String: ");
        String input= scanner.next();
        String input_Reverse= "";

        for(int i=input.length()-1;i>=0;i--){
            input_Reverse= input_Reverse + input.charAt(i);
        }
        System.out.println(input_Reverse);
        if (input.equals(input_Reverse)){
            System.out.println("Yes,It's a palindrome");
        }else{
            System.out.println("Its not a palindrome");
        }
    }
}
