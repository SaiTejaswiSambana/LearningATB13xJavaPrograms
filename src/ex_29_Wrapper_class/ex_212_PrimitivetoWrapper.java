package ex_29_Wrapper_class;

public class ex_212_PrimitivetoWrapper {
    public static void main(String[] args) {
        int a= 10;//Primitive data type

        //This is not a object
        //It will not have attributes or behaviour
        // char, short, byte, long, float, double, - we will avoid them now


        // We will use the Wrapper classes,
        // Character, Boolean, Short, Long, Double, Float

        Integer age = 65;
        System.out.println(Integer.max(10,20));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
    }
}
