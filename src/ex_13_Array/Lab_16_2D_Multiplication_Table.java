package ex_13_Array;

import java.util.Scanner;

public class Lab_16_2D_Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the n = 4");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            for (int j = 0; j<n; j++){
                System.out.print(i * j + " | ");
            }
            System.out.println();
        }
    }
}
