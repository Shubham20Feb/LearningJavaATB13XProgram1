package ex_20_OOPs_Access_Modifier.police;

public class Cop {

    public int gun;
    String iCard;

    // constructor
    public Cop(int bullet) {
        this.gun = bullet;

    }

    // method and behaviour//if this is public we can use this in the different package also but
    //not in case of private and default
    protected void canIShoot() {
        System.out.println("Yes you can shoot !!");
    }

    Void thisDefaultF() {
        System.out.println("hi cop ");
        return null;
    }
}
