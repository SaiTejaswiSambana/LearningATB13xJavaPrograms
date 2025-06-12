package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int Salary=12;
        Boolean b=(!(Salary>10 || Salary<5));
        System.out.println(b);
        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}
