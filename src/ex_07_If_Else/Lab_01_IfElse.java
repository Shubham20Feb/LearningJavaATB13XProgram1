package ex_07_If_Else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_01_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        if(age>18) {
            System.out.println("Allowed to go goa ");

        }
        else {
            System.out.println("Not allowed to go to goa ");
        }
    }
}
