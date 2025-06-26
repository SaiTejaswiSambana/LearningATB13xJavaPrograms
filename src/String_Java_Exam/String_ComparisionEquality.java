package String_Java_Exam;

public class String_ComparisionEquality {
    public static void main(String[] args) {
        //String Comparison and Equality
        //Create a program that demonstrates different ways to compare strings in Java, including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
        //Input:
        //String1: "Hello", String2: "hello", String3: "Hello"
        //Output:
        //equals(): false, equalsIgnoreCase(): true, compareTo(): -32
        String String1="Hello";
        String String2="hello";
        String String3="Hello";
        System.out.println(String1.equals(String2));
        System.out.println(String1.equalsIgnoreCase(String2));
        System.out.println(String1.compareTo(String2));
        System.out.println(String1==String3);
    }
}
