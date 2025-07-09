package ex_20_OOPs_Access_Modifier.criminal;

import ex_20_OOPs_Access_Modifier.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun = 100;
        // this is in different package so procted can not be used fro thief
        // thief.canIShoot();
        // thief.thisDefaultF();

    }
}
