package ex_21_IIB;

public class Lab_01_IIB {

    //IIB
    //Instance initialization block == IIB
    //It will be executed when object is created
    public static void main(String[] args) {
        // If we call object 2 time the IIB and Constructor will also be called 2 time
        // If we have the static block then it will be called only onces
        //Static is called one time because the class is loaded only one time
        //First class will be loaded so Static will be executed first
        A a = new A();
        A a1 = new A();

    }

}

class A {
    //Contractor and IIB is called at the time of the object is created
    //First  Static , IIB will be called the Constructor will be
    A() {
        System.out.println("Default Constructor");
    }

    {
        System.out.println("Hi i am  Instance initialization block ");
        System.out.println("if you want to execute or call something when object is created ");
        // it is used to call My sql
        //read a cvs , xlsx file
        //read json, xml
        //read a text file or env file
    }

    {
        System.out.println("Constructor and IIB is called at the time of object is created or called ");
    }

    {
        System.out.println("Hi i am IIB 3");
    }

    static {
        System.out.println(" This is a static block , it will be called only one time at the time of class loading");
    }
}
