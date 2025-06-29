package ex_02_userInput;

import java.util.Scanner;

public class ForLoop_1to10_XM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        for (int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
}
