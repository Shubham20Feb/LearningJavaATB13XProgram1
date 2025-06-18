package ex_09_ForLoop;

import java.util.Scanner;

public class Lab_13_Switch_Voble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabate ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch){
            case  'a','e','i','o','u' ->System.out.println("it is voble");
            default ->System.out.println("not voble ");
        }
    }
}
