package ex_09_ForLoop;

import java.util.Scanner;

public class Lab_09_ForTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the table no ");
        int num = scn.nextInt();
        System.out.println("Multiplication of table " + num + " :");
        for(int i = 1 ; i<=10; i++){
            System.out.println(num + " *" + i + " =" + num*i );
        }
    }
}
