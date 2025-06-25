package ex_13_Array;

import java.util.Arrays;

public class Lab_04_Array_Print {
    public static void main(String[] args) {
        int[] marks = {77, 44, 66, 77, 88, 99, 55, 66};

        System.out.println( marks.length + "--------------");
        for (int i = 0 ; i<marks.length;i++){
            System.out.println(marks[i]);
        }
       // System.out.println(marks); references address


        Arrays.sort(marks);
        for (int i = 0 ; i<marks.length;i++){
            System.out.println(marks[i]);
        }



    }
}
