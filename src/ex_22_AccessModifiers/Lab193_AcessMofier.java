package ex_22_AccessModifiers;

public class Lab193_AcessMofier {
    public static void main(String[] args) {
        son s= new son();
        s.wecanuse();
    }
}
class father {
    private int Gold = 10;
    int car = 1;
    public int house = 1;
}
    class son extends father{
        void wecanuse(){
            System.out.println(car);
            System.out.println(house);
            //System.out.println(gold);-cannot access gold as it is private.
        }
    }

