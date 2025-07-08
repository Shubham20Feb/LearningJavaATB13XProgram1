package ex_19_OOPs_Static;

public class Lab_03_Static {

}
class B{
    static {
        System.out.println("SIB is called one's class is loaded");
    }
    int a = 12;
    static int b = 14;
    void display(){
        System.out.println(b);// we can call the static variable in the non static function
        System.out.println("Non Static f(n)");
    }
    static void commanToAll(){
        //System.out.println(a);// we can not call the non static variable in the static class
        System.out.println("Static function");
    }
    static class C{
        // This is not used in the automation
    }
}
