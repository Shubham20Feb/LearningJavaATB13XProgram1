package ex_18_OOPs_Abtraction_InterFace;

public class Lab_04_Abstraction {


}

abstract class Incomplete_Abstract {
    int a = 15; // this is not final value , we can change the value of the variable

    abstract void display();

    void display2() {
        a = 55;
        System.out.println("Print");
    }
    //We cab create the constructor for abstractor class
    Incomplete_Abstract(){
        System.out.println("DC");
    }
}

interface Incomplete_Interface {

    int a = 17; // This final , we cnt change the value of this

    void display();

    default void display1() {
        //a=77;
        System.out.println("Default is allowed ");
    }

    default void display2() {
        System.out.println("Default is allowed 11");
    }

    static void display3() {
        System.out.println("Static is allowed ");
    }
    //We can't have constrcuctor for interface
    //Incomplete_Interface(){
    //}

}
