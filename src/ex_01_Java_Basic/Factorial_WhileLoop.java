package ex_02_userInput;
import java.util.Scanner;
public class Factorial_WhileLoop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the required number : ");
        int result=scanner.nextInt();
        double factorial=1;
        int i=1;
        if(result<0){
            System.out.println("Entered number is negative num");
        } else if (result==0) {
            System.out.println("Factorial of '0' is 1");

        }else{
            while(result>=i){
                factorial=factorial*i;
                i++;

                }
                System.out.println("Factorial of "+ result + "is " +factorial);
            }

        }
    }
