package ex_05_UserInput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_03_User_ScannerInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        String canIVote = age >= 18 ? "Yes" : "No";
        System.out.println(canIVote);
    }
}
