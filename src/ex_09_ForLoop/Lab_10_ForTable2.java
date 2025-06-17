package ex_09_ForLoop;

import java.util.Scanner;

public class Lab_10_ForTable2 {
    public static void main(String[] args) {
        // num * 1 = num*1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table the you want to print ");
        int num = sc.nextInt();
        System.out.println("This is the table of " + num + " :");
        for(int i =1; i<=10 ; i++){
            System.out.println(num +"*" + i + " =" + num*i);

        }
    }
}
