package ex_22_AccessModifiers.Police;

public class Cop {
    public int gun;
    private String IdCard;

    public Cop(int bullet){
        this.gun= bullet;
    }
    protected void CanIShoot(){
        System.out.println("Yes you can");
    }
    void thisDefault(){
        System.out.println("Hi cop");
    }
}
