package ex_31_Generics;

public class Lab236_Generics {
    public static void main(String[] args) {
        temp_sum(10,12);
        temp_sum(10.22,21.22);
        temp_sum("Pramod","swe");

    }
    static int temp_sum(int a, int b) {
        System.out.println();
        return a + b;


    }

    static double temp_sum(double a, double b) {
        return a + b;
    }

    static String temp_sum(String a, String b) {
        return a + b;
    }
}
