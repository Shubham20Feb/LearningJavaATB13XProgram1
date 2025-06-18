package ex_10_ProblemSolveing;

import java.util.Scanner;

public class Lab_08_CoutDigit_In_No {
    public static void main(String[] args) {
        // count the digit in the no 7688
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit :");
        int dig = sc.nextInt();
        int i = 0;
        while (dig>0){
            dig = dig/10;
            i++;
        }
        System.out.println(i);
    }
}
