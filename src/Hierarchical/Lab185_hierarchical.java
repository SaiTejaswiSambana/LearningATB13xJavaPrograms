package Hierarchical;

import MultiLevel_Inheritance.Father;

public class Lab185_hierarchical {
    public static void main(String[] args) {
        father f1= new father();
        Pramod p1= new Pramod();
        p1.h2();
        f1.home();
        Lucky L1= new Lucky();
        L1.l2();
        L1.home();
        Roja r1= new Roja();
        r1.r1();
        r1.home();
    }
}

        class father {
            void home() {
                System.out.println("3BHK");
            }
        }
        class Pramod extends father {
            void h2() {
                System.out.println("h2 - Pramod");
            }
        }
        class Lucky extends father {
            void l2() {
                System.out.println("Lucky");
            }
        }
        class Roja extends father {
            void r1() {
                System.out.println("Roja");
            }
        }
