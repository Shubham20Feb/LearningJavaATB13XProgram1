package ex_08_Switch;

import java.util.Scanner;

public class Lab_03_Switch_NoDefault {
    public static void main(String[] args) {
        // taker user input and tell them which day it is
        // ex 1 = monday , ex-7 = sunday
        // 8> not allowed
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter then no 1 to 7 ");
        int day = sc.nextInt();
        switch (day) {

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("tue");
                break;
        }
    }
}
