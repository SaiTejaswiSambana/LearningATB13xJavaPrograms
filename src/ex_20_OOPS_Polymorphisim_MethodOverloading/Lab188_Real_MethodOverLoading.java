package ex_20_OOPS_Polymorphisim_MethodOverloading;

public class Lab188_Real_MethodOverLoading {
    public static void main(String[] args) {
        home h1= new home();
        h1.task();
        h1.task(10);
        h1.task(true);
    }
}
    class  home{
        void task(){
            System.out.println("Task 1");
        }
        int task(int a){
            System.out.println("Task 2");
            return a;//why we have to give return
        }
        boolean task(boolean a){
            return a;
        }
    }