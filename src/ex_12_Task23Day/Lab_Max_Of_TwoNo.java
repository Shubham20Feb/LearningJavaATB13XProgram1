package ex_12_Task23Day;

import java.util.Scanner;

public class Lab_Max_Of_TwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nem1 :: " );
        int num1 = sc.nextInt();
        System.out.println("Enter the seconf no :: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(" Num1 is grester than Num 2 :: " + num1);
        }
        else if(num2> num1){
            System.out.println("Num2 is grester than Num 1 :: " + num2);
        }
        else {
            System.out.println("both the number is equal :: " + num1  + " -- "+ num2);
        }
        sc.close();
    }


}
