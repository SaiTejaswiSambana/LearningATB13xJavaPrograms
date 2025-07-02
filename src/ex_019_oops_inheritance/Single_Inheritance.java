package ex_019_oops_inheritance;

public class Single_Inheritance {
    public static void main(String[] args) {
        Cat c= new Cat();
        c.meow();
        c.makeSound();
    }
}
class Animal{
    void makeSound(){
        System.out.println("Bow Bow");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meow");
    }
}
