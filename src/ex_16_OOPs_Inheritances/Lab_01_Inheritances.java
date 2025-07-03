package ex_16_OOPs_Inheritances;

import ex_16_OOPs_Inheritances.Single_Inheritances.Lab_02_CommonToAll;
import ex_16_OOPs_Inheritances.Single_Inheritances.TestCase1;
import ex_16_OOPs_Inheritances.Single_Inheritances.TestCase2;

public class Lab_01_Inheritances {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold);
        s1.bhk2();
        s1.bhk3();


        // below one is not posible  , it is showing that when father is born chil is allredy there
      //  TestCase2 j5 = new Lab_02_CommonToAll();



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