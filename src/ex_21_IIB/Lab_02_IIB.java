package ex_21_IIB;

import javax.management.MBeanAttributeInfo;

public class Lab_02_IIB {
    public static void main(String[] args) {
        //First class will be loaded so Static will be executed first
        new A1();

    }

}

class A1 {
    //Contractor and IIB is called at the time of the object is created
    //First  Static , IIB will be called theN Constructor will be
    //First class will be loaded so Static will be executed first
    A1() {
        System.out.println("Default Constructor");
    }

    {
        System.out.println("Hi i am  Instance initialization block  1");
        System.out.println("if you want to execute or call something when object is created ");
        // it is used to call My sql
        //read a cvs , xlsx file
        //read json, xml
        //read a text file or env file
    }

    {
        System.out.println("IIB2 ");
    }

    {
        System.out.println(" IIB 3");
    }

    static {
        System.out.println(" SIB 1");
    }
}
