package ex_16_OOPs_Inheritances;

public class Lab_01_Inheritances {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold);
        s1.bhk2();
        s1.bhk3();

    }

}

class Father{
    int gold = 999; // Attribute | Data variables |  Property | Instance Variables


    void bhk2(){  //  Behaviour |  Method | Function | Data members
        System.out.println("Have 2bhk ");
    }

}
class Son extends Father{

    void bhk3(){
        System.out.println("I have 3 bhak ");
    }
}