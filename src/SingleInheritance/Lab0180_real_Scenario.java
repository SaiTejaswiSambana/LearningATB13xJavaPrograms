package SingleInheritance;

public class Lab0180_real_Scenario {
    public static void main(String[] args) {

        TestCase1 t1 = new TestCase1();
        t1.runningTC1();

        TestCase2 t2 = new TestCase2();
        t2.runningTC2();

        CommontoAll c1= new CommontoAll();
        c1.startBrowser();
        CommontoAll c2= new TestCase2();//Dynamic dispatch
       //    TestCase1 t3= new CommontoAll();
    }
}

