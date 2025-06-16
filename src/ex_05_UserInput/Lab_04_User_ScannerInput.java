package ex_05_UserInput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_04_User_ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = sc.next();
        System.out.println(name );
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        System.out.println(age);
        System.out.println("Enter the no ");

    }
}
