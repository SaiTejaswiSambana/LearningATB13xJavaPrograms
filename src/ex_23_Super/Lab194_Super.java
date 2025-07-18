package ex_23_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Dog D1= new Dog();
        D1.Sound();
    }
}
class God{
    public int gold=100;
    void Sound(){
        System.out.println("GOD!!");
    }
    //Default constructor
    God(){
        System.out.println("GOD DC");
    }
    God(int a){
        System.out.println("PC");
    }
}
class Dog extends God{

@Override
    void Sound(){
        super.Sound();
    }
    Dog(){
    super();
    }
    Dog(int a,int b){
        System.out.println(a+b);
    }
    void test(){
        System.out.println(super.gold);
    }
}