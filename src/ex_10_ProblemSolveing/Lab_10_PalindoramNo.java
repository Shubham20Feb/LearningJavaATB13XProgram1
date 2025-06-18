package ex_10_ProblemSolveing;

import java.util.Scanner;

public class Lab_10_PalindoramNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print the no ");
        int no = sc.nextInt();
        int reverse = 0;
        int org = no ;
        while(org>0){
            int ld = org%10;
            reverse= reverse*10 + ld;
            org = org/10;
        }if(no==reverse){
            System.out.println("no is the pelindoren no : " + no );
        }else {
            System.out.println("no is not the pelindorne no : " + no);
        }

    }
}
