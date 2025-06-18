package ex_09_ForLoop;

import java.util.Scanner;

public class Lab_12_ForVobule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabate ");
        char ch = sc.next().toLowerCase().charAt(0);
        //
        if(ch >='a' && ch<='z'){
            if(ch =='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch +" is voble");

            }else {
                System.out.println("is consonent");
            }
        }else {
            System.out.println(" please neter the char only ");
        }

    }
}
