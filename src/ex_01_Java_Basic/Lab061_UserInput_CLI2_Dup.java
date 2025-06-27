package ex_01_Java_Basic;

public class Lab061_UserInput_CLI2_Dup {
    public static void main(String[] args) {
        System.out.println(args[0]);// java.lang.ArrayIndexOutOfBoundsException
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);// java.lang.ArrayIndexOutOfBoundsException
    }
}
