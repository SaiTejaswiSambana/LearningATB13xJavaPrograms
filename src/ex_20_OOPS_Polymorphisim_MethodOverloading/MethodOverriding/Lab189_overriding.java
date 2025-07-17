package ex_20_OOPS_Polymorphisim_MethodOverloading.MethodOverriding;

public class Lab189_overriding {
    public static void main(String[] args) {
    Animal A1= new Animal();
    A1.sound();
    Dog D1= new Dog();
    D1.sound();//incase if no method found innDog class by default Animal method will execute
     //   Animal A1= new Dog();-Dynamic Dispatch
      //  A1.sound();

    }
}
class Animal{
    void sound(){
        System.out.println("Default Sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
