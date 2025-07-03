package ex_16_OOPs_MultiLeve_Inheritances;

public class Lab_01_MultiLeve_RunerClass {
    public static void main(String[] args) {
        GrandFather gd = new GrandFather();
        gd.home();
        gd.gf();
        System.out.println("-------");
        Father f1 = new Father();
        f1.gf();
        f1.f();


        System.out.println("-----");
        Son s1 = new Son();
        s1.S();
        s1.gf();
        s1.f();
    }
}
