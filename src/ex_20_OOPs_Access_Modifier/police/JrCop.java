package ex_20_OOPs_Access_Modifier.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrcop = new Cop(9);
        // as there is protected  so we can use in the same package
        jrcop.canIShoot();
        jrcop.thisDefaultF();
    }
}
