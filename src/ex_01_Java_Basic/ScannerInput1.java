package ex_01_Java_Basic;

import java.util.Scanner;

public class ScannerInput1 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name ");
        String name = sc.nextLine();
        System.out.print("Enter the float value ");
        float f = sc.nextFloat();
        System.out.println("My name is " + name +"  My age is  "+ a +" Float no " + f);
        //sc.close();
       // System.out.println("hi " + name);


    }
}
