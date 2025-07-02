package MultiLevel_Inheritance;

public class Lab184_MultiLevel {
    public static void main(String[] args) {
        /* below way should be declared
   Son so= new GrandFather();

    Son So1= new Father();*/

        Son Harsh= new Son();
        Harsh.s();
        GrandFather GF=new Son();
        GF.gf();
    }



}
