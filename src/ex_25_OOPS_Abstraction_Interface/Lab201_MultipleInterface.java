package ex_25_OOPS_Abstraction_Interface;

public class Lab201_MultipleInterface {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.money();
    }
}


interface Father1{
    void money();
}
interface Father2{
    void money();
}

class Child implements Father1,Father2{


    @Override
    public void money() {
        System.out.println("Child own Money!");
    }
}

