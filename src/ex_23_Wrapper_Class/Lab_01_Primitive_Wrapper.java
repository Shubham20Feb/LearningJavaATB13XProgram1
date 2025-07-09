package ex_23_Wrapper_Class;

import java.sql.SQLOutput;

public class Lab_01_Primitive_Wrapper {
    public static void main(String[] args) {


        int a = 10; // primitive data type
        //This is not an object
        //This will not have attribute or behaviour
        //char , short,byte,long ,float,double-- we will avoid them now

        // we will use the wrrapper clasess
        //Character , Boolean, Short,Long,Double,Float
       Integer age = 65;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());

    }
}
