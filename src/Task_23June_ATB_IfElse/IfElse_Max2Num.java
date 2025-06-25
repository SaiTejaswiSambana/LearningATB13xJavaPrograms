package Task_23June_ATB_IfElse;
import java.util.Scanner;
public class IfElse_Max2Num {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2=scanner.nextInt();

        if(num1==num2){
            System.out.println("Both numbers are equal");
        }else{
            System.out.println(Math.max(num1,num2) + " is Greater");
        }
       /* if(num1 > num2){
            System.out.println(num1+" is the largest");
        }
        else if(num2 < num1){
            System.out.println(num2+" is the largest");
        }
        else{
            System.out.println("Both are equal");
        }*/
    }
}
