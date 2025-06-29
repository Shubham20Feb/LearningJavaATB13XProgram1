package ex_13_Array;

import java.util.Scanner;

public class Lab_15_2D_Right_Tringle {
    public static void main(String[] args) {
        //how the patter that we want
        // n=3
        // *
        // * *
        // * * *
        System.out.println("enter the n ex n=3");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i< n;i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
