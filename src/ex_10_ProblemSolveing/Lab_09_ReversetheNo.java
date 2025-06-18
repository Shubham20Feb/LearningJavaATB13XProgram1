package ex_10_ProblemSolveing;

import java.util.Scanner;

public class Lab_09_ReversetheNo {
    public static void main(String[] args) {
        // reverse the no
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no :");
        int no = sc.nextInt();
         int sum = 0;
         while (no>0) {
             int ld = no%10;
             sum = sum*10 + ld;
             no = no/10;
         }
        System.out.println(sum);
         }
    }

