package ATB_XM_Test_Programs;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Check_Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number" );
        int input= scanner.nextInt();
        if (input>0){
            System.out.println("Positive number "+ input);
        }else if(input<0){
            System.out.println("Negative num "+ input);
        }else {
               System.out.println("Input is Zero "+ input);
        }

        }
    }
