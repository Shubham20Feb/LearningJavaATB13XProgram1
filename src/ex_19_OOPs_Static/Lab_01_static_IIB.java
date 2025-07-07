package ex_19_OOPs_Static;

public class Lab_01_static_IIB {
    public static void main(String[] args) {
        P p1 = new P();
        P p2 = new P();
        // IF STATIC WE CAN DIRECTLY CALL THAT IN OUT PRINT STATEMENT
        System.out.println(P.a);
        p1.a=14;
        System.out.println(P.a);
        System.out.println(p1.a);
        System.out.println(p2.a);


    }

}
class P{
    static int a = 65;

}
