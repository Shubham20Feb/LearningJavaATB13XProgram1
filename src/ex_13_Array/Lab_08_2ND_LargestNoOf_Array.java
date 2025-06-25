package ex_13_Array;

import java.util.Arrays;

public class Lab_08_2ND_LargestNoOf_Array {
    public static void main(String[] args) {
        int[] no = { 2,4,5,6,3,2,4,8};

        Arrays.sort(no);
        System.out.println(no[no.length-2]);
    }
}
