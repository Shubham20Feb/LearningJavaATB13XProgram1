package ex_01_Java_01;

import java.util.Scanner;

public class ScannerInput {
    public static void main (String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("What is your age ");
        int a = Sc.nextInt();
        System.out.print("What is your name ");
        Sc.nextLine();
        String Name = Sc.nextLine();
        System.out.print("Enater the float value is this ");
        float sd = Sc.nextFloat();
        System.out.println("Hello " + Name + " Yor are " + a + " Year Old  " + "Float value  " + sd);


    }
}
