package ex_22_AccessModifiers.Criminal;

import ex_22_AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief= new Cop(100);
        thief.gun=100;

        //        thief.canIShoot(); protected access modifier cannot accessible in other packages
        // thief.thisDefaultF1();
    }
}
