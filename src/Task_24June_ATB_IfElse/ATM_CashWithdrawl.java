package Task_24June_ATB_IfElse;

import java.util.Scanner;

public class ATM_CashWithdrawl {
    public static void main(String[] args) {
       //Initialize the account balance
        long Amount=10000;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the amount you want to withdrawn ");
        //Take user input
        long Amount_Withdrawl=scanner.nextLong();

        if(Amount_Withdrawl%100==0 && Amount_Withdrawl<=10000){
            Amount=Amount-Amount_Withdrawl;
            //  System.out.println(Amount);
        } else if (Amount_Withdrawl%100!=0) {
            System.out.println("Entered amount should be multiples of 100");
        } else  {
            System.out.println("Enter amount exceeds the savings amount");

        }
        System.out.println("Balance Amount is "+ Amount);

    }
}
