package ex_08_Switch;

import java.util.Scanner;

public class Lab_02_Switch_WithOutBreak {
    public static void main(String[] args) {
        // taker user input and tell them which day it is
        // ex 1 = monday , ex-7 = sunday
        // 8> not allowed
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter then no 1 to 7 ");
        int day = sc.nextInt();
        switch (day){

            case 1 :
                System.out.println("Mon");

            case 2 :
                System.out.println("tue");

            case 3 :
                System.out.println("wed");

            case 4 :
                System.out.println("thr");

            case 5 :
                System.out.println("fri");

            case 6 :
                System.out.println("sat");

            case 7 :
                System.out.println("sun");

            default:
                System.out.println("not allowed ");

        }
    }
    }

