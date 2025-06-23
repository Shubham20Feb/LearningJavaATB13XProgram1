package ex_12_Task23Day;

import java.util.Scanner;

public class Lab_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ::");
        int num = sc.nextInt();

        if(num % 2 == 0 ){
            System.out.println(" no is even no " + num );
        }else {
            System.out.println("no is odd no :: " + num);
        }
        sc.close();

    }
}
