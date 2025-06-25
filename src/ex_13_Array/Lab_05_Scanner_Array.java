package ex_13_Array;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab_05_Scanner_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array int only ");
        int size = sc.nextInt();

        //        float[] numbers_marks =  new float[size];
        // String[] numbers_marks =  new String[size];

        int[] abc = new int[size];
        for ( int i = 0 ; i<abc.length;i++){
            System.out.println("Enter the number");
            abc[i]= sc.nextInt();
        }
        System.out.println("Print the below code -------------");
        for (int i = 0; i<abc.length;i++){
            System.out.println(abc[i]);
        }
    }

}
