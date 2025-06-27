package Task_24June_ATB_IfElse;

import java.util.Scanner;

public class Char_Is_Alphabet {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter alphabets from a to z :");
        char ch=scanner.next().charAt(0);
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.println("Its a Alphabet");
        }else{
            System.out.println("Its not a Alphabet");
        }
    }
}
