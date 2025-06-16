package ex_08_Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_04_Real_Switch_Automatio {
    public static void main(String[] args) {
        // web automation
        // ask user to enter the browser which he want to start
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser which you want to start");
        String bro = sc.next();
        // bro = bro.toLowerCase();

        switch (bro){
            case "Chrome":
                System.out.println("Opening chrome ");
                System.out.println("--------");
                System.out.println("Tc1");
                System.out.println("Tc2");
                break;
            case "Edge":
                System.out.println("Opening Edge");
                System.out.println("-----");
                System.out.println("Tc1");
                System.out.println("Tc2");
                break;
            case "Firefox":
                System.out.println("Opening Firefox");
                System.out.println("-----");
                System.out.println("Tc1");
                System.out.println("Tc2");
                break;
            default:
                System.out.println("no ides which broweser to open ");
                break;


        }
    }
}
