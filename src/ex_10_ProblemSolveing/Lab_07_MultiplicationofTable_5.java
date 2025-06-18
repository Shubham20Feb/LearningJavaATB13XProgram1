package ex_10_ProblemSolveing;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_07_MultiplicationofTable_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table no that we want to print :");
        int tab = sc.nextInt();
        System.out.println("we are printing the table of :" + tab);

        for(int i=1; i<=10; i++){
            // tab * "i" + "=" tab*i;
            System.out.println(tab +"*" + i + "=" + tab*i);
        }
    }
}
