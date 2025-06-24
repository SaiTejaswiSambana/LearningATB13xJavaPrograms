package Task_23June_ATB_IfElse;

import java.util.Scanner;

public class IfElse_char_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a single Character");
        char ch= scanner.next().toLowerCase().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Entered character is vowel");
        } else{
        System.out.println("Entered character is consonant");
        }
    }
}
