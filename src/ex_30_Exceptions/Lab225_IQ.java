package ex_30_Exceptions;

import java.lang.reflect.Array;

public class Lab225_IQ {
    public static void main(String[] args) {
       try{ String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        Integer a = Integer.parseInt(input_user); // java.lang.NumberFormatException
        Integer output = 100/a;
       }catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
           System.out.println(e.getMessage());
       }
    }
}
